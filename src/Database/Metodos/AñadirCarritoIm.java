/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.AñadirCarrito;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author O-5-K
 */
public class AñadirCarritoIm extends UnicastRemoteObject implements AñadirCarrito{
        public AñadirCarritoIm() throws RemoteException{}

    String[] StrTip;
    String [] StrSab;
     ListaTipos ListTip = new ListaTipos();
     ListaSaboresIm ListSab = new ListaSaboresIm();
     
    private static Statement smt;
        Conexion db = new Conexion();
        Connection con =db.getCon();
        String resultado;
        
    @Override
    public void añadir(int idUsuario, int idProducto, int cantidad) {
        try {
            smt = con.createStatement();
            String sql;
            sql="INSERT INTO `pasteles`.`carrito` (`idUsuario`, `Pedidos`, `Cantidad`) VALUES ('"+idUsuario+"','"+idProducto+"','"+cantidad+"');";
            smt.executeUpdate(sql);
            //System.out.println("Exito");
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
