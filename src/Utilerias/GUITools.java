package Utilerias;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EduardoCGarcia
 */
public class GUITools {

    private JPanel padre;
    private JPanel hijo;
    
        public static void panelIntoPanel(JPanel padre, JPanel hijo) {
        hijo.setBounds(0, 0, padre.getWidth(), padre.getHeight());//definir tamaño y posicion del hijo
        padre.removeAll();
        padre.add(hijo);
        padre.revalidate();
        padre.repaint();
    }
    public static DefaultTableModel getRowModel(String filas[]){
        DefaultTableModel modelo =  new DefaultTableModel();
        
        modelo.addRow(filas);
        
        return modelo;
    }
        
    public static DefaultTableModel getColumnsModel(ArrayList<String> columnas){
        DefaultTableModel modelo =  new DefaultTableModel();
        
        for(Object col:columnas){
            modelo.addColumn(col);
        }
        
        return modelo;
    }


}
