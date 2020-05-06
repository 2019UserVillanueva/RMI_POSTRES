
import Database.Metodos.LogIn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Database.Metodos.LogIn;
import javax.swing.JOptionPane;

/**
 *
 * @author O-5-K
 */
public class PruebaLogin {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogIn login= new LogIn();
        
        String Correo= JOptionPane.showInputDialog("Ingresa tu Correo");
        String Password= JOptionPane.showInputDialog("Ingresa Tu Contraseña");
        
        System.out.println(login.Log(Correo, Password));        
        
    }
    
}
