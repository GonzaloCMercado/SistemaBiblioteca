package DML;

import Modelo.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author EduardoCGarcia
 */
public class DML {
    public static ArrayList primerReporte(){
        ArrayList reporte1 = new ArrayList();
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
            while(rs.next()){
                 reporte1.add(String.format("%s %s %s\n", rs.getString("nombre_libro"),rs.getString("nombre_lector"),rs.getString("Fecha_Sale")));
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return reporte1;
    }
}
