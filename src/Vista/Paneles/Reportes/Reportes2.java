/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.Paneles.Reportes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EduardoCGarcia
 */
public class Reportes2 extends javax.swing.JPanel {

    private String usuario;
    private String password;

    /**
     * Creates new form ReportesLibros
     */
    public Reportes2() {
        initComponents();
        jTable1.setModel(setModelAndTableModel());
    }

    public Reportes2(String usuario, String password) {
        initComponents();
        jTable1.setModel(setModelAndTableModel());
        this.usuario = usuario;
        this.password = password;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de libros con los que cuenta cada sucursal de biblioteca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public static DefaultTableModel setModelAndTableModel() {
        DefaultTableModel modelo = setColumnsTable();
        //Colocar los valores obtenidos de las tablas de la bases de datos en un arrayList 
        //dicho arraylist debe ser iterado en el foreach que esta abajo y en cada String 
        //colocar los atributos que sean creados, a que estos seran los renglones
//        for (Maicitos m : Main.maicitos) {
//            String filas[]={
//                String.format("%d",m.getId()),
//                m.getSabor(),
//                String.format("%.2f",m.getPrecio()),
//                String.format("%d",m.getTam()),
//                String.format("%d",m.getCantidad())
//            };
//            modelo.addRow(filas);
//        }
        return modelo;
    }

    public static DefaultTableModel setColumnsTable() {
        /*Listado de libros con los que cuenta cada sucursal de
        biblioteca, deberá incluir nombre del autor y nombre de 
        la editorial.
    
    
         */
        DefaultTableModel modelo = new DefaultTableModel();
        /*Establecemos las columnas*/
        ArrayList<String> columnas = new ArrayList<String>();
        columnas.add("Libro");
        columnas.add("Autor");
        columnas.add("Editorial");
        columnas.add("Surcursal");

        for (Object col : columnas) {
            modelo.addColumn(col);
        }
        return modelo;
    }

}
