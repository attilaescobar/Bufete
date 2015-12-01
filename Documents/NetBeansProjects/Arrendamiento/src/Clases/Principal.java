/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Formularios.Login;
import javax.swing.JOptionPane;
/**
 *
 * @author Julian-
 */
public class Principal {
    
    public static void main(String[] args){
        
//        String msj;
//        NodoPropietario p = new NodoPropietario(123, "julian", "escobar", "23", "1234", "asfsda");
//        ListaPropietario miPropietario = new ListaPropietario();
//        msj = miPropietario.InsertarOrdenado(p);
//        JOptionPane.showMessageDialog(null, msj);
        
        Datos misDatos = new Datos();
        Login miLogin = new Login();
        miLogin.setDatos(misDatos);
        miLogin.setVisible(true);
        
    }
}
