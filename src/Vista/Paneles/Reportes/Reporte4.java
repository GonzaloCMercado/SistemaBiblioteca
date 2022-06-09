package Vista.Paneles.Reportes;

import Modelo.ConexionBD;
import Utilerias.Mostrar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EduardoCGarcia
 */
public class Reporte4 extends javax.swing.JPanel {

    private String usuario;
    private String password;

    /**
     * Creates new form ReportesLibros
     */
    public Reporte4() {
        initComponents();
        llenarComboBox(cbxFecha);
    }

    public Reporte4(String usuario, String password) {
        initComponents();
        llenarComboBox(cbxFecha);
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
        cbxFecha = new javax.swing.JComboBox<>();

        tblContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblContent);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de los lectores que han solicitado libros en una fecha de devolucion.");

        cbxFecha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFechaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(cbxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(cbxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxFechaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFechaItemStateChanged
        this.crearTabla();
    }//GEN-LAST:event_cbxFechaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxFecha;
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
            pst = conexion.cn.prepareStatement("SELECT lector.Nombre FROM lector,prestamos \n"
                    + "where prestamos.Fecha_Dev = ? \n"
                    + "AND lector.Num_Targeta = prestamos.Num_Targeta");

            pst.setString(1, (String)cbxFecha.getSelectedItem());        
            
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) {
                String filas[] = {
                    String.format(rs.getString("Nombre")),
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
            columnas.add("nombre_lector");

        for (Object col : columnas) {
            modelo.addColumn(col);
        }
        return modelo;
    }
    
    public void llenarComboBox(JComboBox cbox) {
        try {
            ConexionBD conexion = new ConexionBD();
            conexion.estableceConexion("root", "");
            PreparedStatement pst = conexion.cn.prepareStatement("SELECT * FROM prestamos;");
            ResultSet result = pst.executeQuery();

            while (result.next()) {
                cbox.addItem(result.getString("Fecha_Dev"));
            }

        } catch (Exception e) {
            Mostrar.Mensaje("Error al cargar datos");
        }

    }
}
