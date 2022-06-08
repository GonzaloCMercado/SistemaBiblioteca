/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Utilerias.Mostrar;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gonzalo CH
 */
public class ConexionBD {
    
    public Connection cn = null;
    //String usuario = "Gonzalo"; //Nombre del usuario
    //String contraseña = "z8*A+h59*e";   //Contraseña del usuario
    //usuario: root  Contraseña: Eliza1234
    public Connection estableceConexion(String usuario, String contraseña) {

        String bd = "biblioteca";         //Nombre de la BD
        String servidor = "localhost";      //Nombre o ruta del servidor
        String puerto = "3306";             //Puerto de enlace
        String cadena = "jdbc:mysql://" + servidor + ":" + puerto + "/" + bd;    //Cadena para conexion con BD
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(cadena, "root", "");
            //PreparedStatement pst;
            Mostrar.Mensaje("Conexión exitosa");
        } catch (Exception e) {
             Mostrar.Mensaje("Error:" + e.toString());
        }
        return cn;
    }
    
}
