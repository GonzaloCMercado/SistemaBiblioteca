/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.Paneles.Reportes;

import Modelo.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        this.crearTabla();
    }

    public Reportes2(String usuario, String password) {
        initComponents();
        this.crearTabla();
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
        tblContent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tblContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblContent);

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
    private javax.swing.JTable tblContent;
    // End of variables declaration//GEN-END:variables

    public void crearTabla() {
        DefaultTableModel modelo = setColumnsTable();
        try {
            ConexionBD conexion = new ConexionBD();
            conexion.estableceConexion("root", "");
            PreparedStatement pst;
            pst = conexion.cn.prepareStatement("SELECT libro.Nombre,autores.Nombre AS Autores, editorial.Nombre AS Editorial, sucursal.Nom_Sucursal FROM libro, sucursal, copias_libro, autores, editorial \n"
                    + "where libro.ID_Libro = copias_libro.ID_Libro AND sucursal.ID_Sucursal = copias_libro.ID_Sucursal\n"
                    + "AND libro.ID_Autor = autores.ID_Autor \n"
                    + "AND editorial.ID_Editorial = libro.ID_Editorial");

            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) {
                String filas[] = {
                    String.format(rs.getString("Autores")),
                    String.format(rs.getString("Editorial")),
                    String.format(rs.getString("Nom_Sucursal"))
                };
                modelo.addRow(filas);
            }

            this.tblContent.setModel(modelo);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static DefaultTableModel setColumnsTable() {
        DefaultTableModel modelo = new DefaultTableModel();
        /*Establecemos las columnas*/
        ArrayList<String> columnas = new ArrayList<String>();
        columnas.add("Autores");
        columnas.add("Editorial");
        columnas.add("Nom_Sucursal");

        for (Object col : columnas) {
            modelo.addColumn(col);
        }
        return modelo;
    }

}
