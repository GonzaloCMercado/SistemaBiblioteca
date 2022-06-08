/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ConexionBD;
import Utilerias.FondoImagen;
import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author Gonzalo CH
 */
public class Login extends javax.swing.JFrame {

    private String usuario;
    private String contraseña;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Avatar = new Utilerias.FondoImagen("Avatar.jpeg");
        Encabezado = new javax.swing.JPanel();
        PieDePagina = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Avatar.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout AvatarLayout = new javax.swing.GroupLayout(Avatar);
        Avatar.setLayout(AvatarLayout);
        AvatarLayout.setHorizontalGroup(
            AvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        AvatarLayout.setVerticalGroup(
            AvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        Encabezado.setBackground(new java.awt.Color(42, 201, 26));
        Encabezado.setForeground(new java.awt.Color(42, 201, 26));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        PieDePagina.setBackground(new java.awt.Color(42, 201, 26));
        PieDePagina.setForeground(new java.awt.Color(42, 201, 26));

        javax.swing.GroupLayout PieDePaginaLayout = new javax.swing.GroupLayout(PieDePagina);
        PieDePagina.setLayout(PieDePaginaLayout);
        PieDePaginaLayout.setHorizontalGroup(
            PieDePaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PieDePaginaLayout.setVerticalGroup(
            PieDePaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        lblUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Usuario:");

        lblPassword.setBackground(new java.awt.Color(0, 0, 0));
        lblPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnIngresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PieDePagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword)
                            .addComponent(lblUsuario))
                        .addGap(37, 37, 37)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addGap(248, 248, 248))))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(PieDePagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        ConexionBD c = new ConexionBD();
        try {

            usuario = txtUsuario.getText();
            contraseña = String.copyValueOf(txtPassword.getPassword());
            c.estableceConexion();
            if (c.cn != null) {
                //Login l = new Login(usuario, contraseña);
//                l.setLocationRelativeTo(null);
//                l.setVisible(true);
//                l.toFront();
                Princial o = new Princial(usuario, contraseña);
                this.dispose();
            } else {
                txtUsuario.setBorder(BorderFactory.createLineBorder(Color.RED));
                txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            c.cn.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Avatar;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel PieDePagina;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
