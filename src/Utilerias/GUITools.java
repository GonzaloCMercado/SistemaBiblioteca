package Utilerias;

//import Controllers.CRUD;
//import Modelos.Maicitos;
//import Modelos.Venta;
//import app.Main;
//import Modelos.Genericos.Solicitud;
//import Vista.app;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EduardoCGarcia
 */
public class GUITools {

    private JPanel padre;
    private JPanel hijo;
    
        public static void panelIntoPanel(JPanel padre, JPanel hijo) {
        hijo.setBounds(0, 0, padre.getWidth(), padre.getHeight());//definir tamaño y posicion del hijo
        //hijo.setBackground(Color.red);
        padre.removeAll();
        padre.add(hijo);
        padre.revalidate();
        padre.repaint();
    }
//    public static DefaultTableModel setModelAndTableModel(){

//        DefaultTableModel modelo =  setColumnsTable();
//        for (Solicitud s : app.solicitudes) {
//            String filas[]={
//                String.format("%s",s.getFolio().getFolio()),
//                s.getAsunto(),
//                s.getEstatus(),
//                String.format("%s", s.getFechaDeSolicitud().format(DateTimeFormatter.ISO_LOCAL_DATE)),
//                String.format("%s",s.getSolitante().getNumero())
//            };
//            modelo.addRow(filas);
//        }
//        return modelo;
//    }
//
//   
//    public static DefaultTableModel setColumnsTable(){
//        DefaultTableModel modelo =  new DefaultTableModel();
//        /*Establecemos las columnas*/
//        ArrayList<String> columnas = new ArrayList<String> ();
//        columnas.add("Folio");
//        columnas.add("Asunto");
//        columnas.add("Estatus");
//        columnas.add("Fecha");
//        columnas.add("Numero de Cuenta");
//        
//        for(Object col:columnas){
//            modelo.addColumn(col);
//        }
//        return modelo;
//    }
//    public static DefaultTableModel setColumnsTableVentas(){
//        DefaultTableModel modelo =  new DefaultTableModel();
//        /*Establecemos las columnas*/
//        ArrayList<String> columnas = new ArrayList<String> ();
//        columnas.add("Fecha");
//        columnas.add("Cliente");
//        columnas.add("Sabor");
//        columnas.add("Cantidad");
//        columnas.add("Total");
//        
//        for(Object col:columnas){
//            modelo.addColumn(col);
//        }
//        return modelo;
//    }
//    
//    public static DefaultTableModel setModelAndTableModelVenta(){
//        DefaultTableModel modelo =  setColumnsTableVentas();
//        
//        for (Venta v : Main.ventas) {
//            Maicitos m = CRUD.findMaicito(v.getIdSabor());
//            String filas[]={
//                String.format(v.getFecha().toString()),
//                String.format(v.getNombreCliente()),
//                String.format(m.getSabor()),
//                String.format("%d",v.getCantidad()),
//                String.format("%.2f",v.getTotal())
//            };
//            modelo.addRow(filas);
//        }
//        return modelo;
//    }
//    

}
