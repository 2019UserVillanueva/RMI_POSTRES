/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastelesserver;

import Database.Metodos.AltaPrductoIm;
import Database.Metodos.AñadirCarritoIm;
import Database.Metodos.EditarProductoIm;
import Database.Metodos.EliminarCarritoIm;
import Database.Metodos.ListaSaboresIm;
import Database.Metodos.ListaTipos;
import Database.Metodos.TotalCarritoIm;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;


/**
 *
 * @author O-5-K
 */
public class PastelesServer {
    
    private static Statement smt;
    private static ResultSet rs;
   
    
    //punto 1 Area del piso.
    public static String getArea_piso(Connection con){
        String aux=null;
         try {
            smt = con.createStatement();
            String sql = "SELECT Correo FROM usuario WHERE idUsuario = '"+3+"'";
            rs = smt.executeQuery(sql);
            while(rs.next())
                aux = rs.getString(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return aux;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
           
        TotalCarritoIm total= new TotalCarritoIm();
        System.out.println(total.Total(1));
//        String[] tipo= listip.lista();
//        String[] sabor= lissab.Lista();
//       String Tipo = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo", "Tipos", JOptionPane.QUESTION_MESSAGE, null, tipo ,tipo[0] );
//        String Sabor = (String) JOptionPane.showInputDialog(null, "Seleccione el Sabopr", "Sabores", JOptionPane.QUESTION_MESSAGE, null, sabor, sabor[0]);
//        String Nombre=JOptionPane.showInputDialog("Nombre del Producto");
//        String Descripcion=JOptionPane.showInputDialog("Descripcicion del producto");
//        int stock=Integer.parseInt(JOptionPane.showInputDialog("stock"));
//        int precio=Integer.parseInt(JOptionPane.showInputDialog("precio"));

           

    }
        
}
