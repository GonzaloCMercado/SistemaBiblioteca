/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Gonzalo CH
 */
public class PrincipalPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String reporte1 = "";
        ArrayList<String> renglones = new ArrayList<String>();
        
        try {
            ConexionBD conexion = new ConexionBD();
            conexion.estableceConexion();
            //Procedimiento para buscar a un alumno por medio de su ID
            PreparedStatement pst;
            pst = conexion.cn.prepareStatement("SELECT libro.Nombre AS nombre_libro, lector.Nombre \n" +
                                                "AS nombre_lector, prestamos.Fecha_Sale FROM libro,lector,prestamos \n" +
                                                "where libro.ID_Libro = prestamos.ID_Libro \n" +
                                                "AND lector.Num_Targeta = prestamos.Num_Targeta\n" +
                                                "ORDER BY prestamos.Fecha_Sale");

            ResultSet rs = pst.executeQuery();
            int i = 0;
            while(rs.next()){
                renglones.add(rs.getString("nombre_libro"));
                renglones.add(rs.getString("nombre_lector"));
                renglones.add(rs.getString("Fecha_Sale"));
                reporte1.add(renglones);
                renglones.removeAll(renglones);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}