package DML;

import Modelo.ConexionBD;

/**
 *
 * @author EduardoCGarcia
 */
public class DML {
    public static void insertCliente(int Num_Trajeta,String Nombre, String Direccion, String Telefono, String Email){
//        try {
//            ConexionBD c = new ConexionBD();
//            c.estableceConexion("localhost", Nombre);
//            PreparedStatement pst, pst2, pst3; //Se crean dos objetos de tipo PreparedStatement que nos servira para interactuar con la BD
//            //Ingrezar datos personales
//            pst = c.cn.prepareStatement("INSERT INTO alumno values(?,?,?,?,?,?,?,?,?,?,?)"); //Se realiza la insercion pero aun no se mandan datos
//
//            pst.setString(1, mat); //Se indica el valor del ID pero al ser autoincrementable este se ignora (aun asi se debe enviar)
//            pst.setString(2, JPanelDatosPersonales.txtNombre.getText().toUpperCase()); //Se indica la cadena nombre a enviar en el campo nombre
//            pst.setString(3, JPanelDatosPersonales.txtApellidoPaterno.getText().toUpperCase().trim()); //Se indica la cadena Apellido Paterno
//            pst.setString(4, JPanelDatosPersonales.txtApellidoMaterno.getText().toUpperCase().trim()); //Se indica el apellido materno
//            pst.setString(5, JPanelDatosPersonales.txtCorreo.getText().trim());
//            pst.setString(6, JPanelDatosPersonales.txtTel.getText().trim());
//            String fecha = JPanelDatosPersonales.txtAño.getText().trim() + "/" + JPanelDatosPersonales.txtMes.getText().trim() + "/" + JPanelDatosPersonales.txtDia.getText().trim();
//            pst.setString(7, fecha);
//            pst.setString(8, JPanelDatosPersonales.txtCalle.getText().toUpperCase().trim());
//            pst.setString(9, JPanelDatosPersonales.txtColonia.getText().toUpperCase().trim());
//            pst.setString(10, JPanelDatosPersonales.txtMunicipio.getText().toUpperCase().trim());
//            pst.setString(11, JPanelDatosPersonales.txtEstado.getText().toUpperCase().trim());
//
//            pst.executeUpdate();
//    }
    }
}
