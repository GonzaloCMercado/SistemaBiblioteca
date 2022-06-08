/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        try {
            ConexionBD conexion = new ConexionBD();
            conexion.estableceConexion();
            //Procedimiento para buscar a un alumno por medio de su ID
            PreparedStatement pst,pst2;
            pst = conexion.cn.prepareStatement("SELECT libro.Nombre AS nombre_libro, lector.Nombre \n" +
                                                "AS nombre_lector, prestamos.Fecha_Sale FROM libro,lector,prestamos \n" +
                                                "where libro.ID_Libro = prestamos.ID_Libro \n" +
                                                "AND lector.Num_Targeta = prestamos.Num_Targeta\n" +
                                                "ORDER BY prestamos.Fecha_Sale");
            //pst.executeUpdate();//Se ejecuta la instruccion

            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                reporte1 += String.format("%s %s %s\n", rs.getString("nombre_libro"),rs.getString("nombre_lector"),rs.getString("Fecha_Sale"));
                
            }
            System.out.println(reporte1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}