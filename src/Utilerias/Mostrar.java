/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilerias;

import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo CH
 */
public class Mostrar {
    public static void Mensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje); 
    }
    public static int respSimple(String mensaje){
        int i;
        i = JOptionPane.showConfirmDialog(null,mensaje);
        if(i == 2){
        Mostrar.Mensaje("Operacion cancelada");
        }
        return i;
    }
}
