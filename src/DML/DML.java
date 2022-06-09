package DML;

import Utilerias.GUITools;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EduardoCGarcia
 */
public class DML {

    String reporte1 = "SELECT libro.Nombre AS nombre_libro, lector.Nombre \n"
            + "AS nombre_lector, prestamos.Fecha_Sale FROM libro,lector,prestamos \n"
            + "where libro.ID_Libro = prestamos.ID_Libro \n"
            + "AND lector.Num_Targeta = prestamos.Num_Targeta\n"
            + "ORDER BY prestamos.Fecha_Sale";

            
    
    public static void prepareTable(JTable t){
        DefaultTableModel modelo;
        ArrayList<String> columnas = new ArrayList<String>();
        columnas.add("nombre_libro");
        columnas.add("nombre_lector");
        columnas.add("Fecha_Sale");
        
        modelo = GUITools.getColumnsModel(columnas);
        
        
    }
}
