/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.EliminarProducto;
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
public class EliminarProductoIm extends UnicastRemoteObject implements EliminarProducto{
        public EliminarProductoIm() throws RemoteException{}

    int[] numer;
    private static Statement smt;
    Conexion db = new Conexion();
    Connection con =db.getCon();
    private static ResultSet rs;
    String aux;
    
    @Override
    public void EliminarPro(int idProducto) {
        try {
            smt = con.createStatement();
            String sql;
            sql="DELETE FROM `pasteles`.`productos` WHERE  `idProductos`="+idProducto+";";
            smt.execute(sql);
            } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    
}
