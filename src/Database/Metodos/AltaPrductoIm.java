/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.AltaProducto;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author O-5-K
 */
public class AltaPrductoIm extends UnicastRemoteObject implements AltaProducto{
    public AltaPrductoIm() throws RemoteException{}
    String[] StrTip;
    String [] StrSab;
     ListaTipos ListTip = new ListaTipos();
     ListaSaboresIm ListSab = new ListaSaboresIm();
     
    private static Statement smt;
        Conexion db = new Conexion();
        Connection con =db.getCon();
        String resultado;
     
    
    @Override
    public void AltaPro(String Tipo, String sabor, String Nombre, int Tienda, String Descripcion, int stock, int precio) {
        try {
            smt = con.createStatement();
            String Sql="INSERT INTO `pasteles`.`productos` (`IdSabor`, `Nombre`, `IdTiend`, `IdTipo`, `Descripcion`, `stock`, `Precio`) VALUES ('"+sabor+"', '"+Nombre+"', '"+Tienda+"', '"+Tipo+"', '"+Descripcion+"', '"+stock+"', '"+precio+"')";
                smt.executeUpdate(Sql);
                
            //System.out.println("Exito");
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
}
