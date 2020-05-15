/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.Carrito;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author O-5-K
 */
public class CarritoIm extends UnicastRemoteObject implements Carrito{
    public CarritoIm() throws RemoteException{}
    private static Statement smt;
    Conexion db = new Conexion();
    Connection con =db.getCon();
    int numero=0, i=0;
    String[] idProductos, nombreProductos, Cantidad, Precio;
    private static ResultSet rs;
    @Override
    
    public String[] Nombre(String idCliente) {
        numero=0;
        try{
        smt = con.createStatement();
            String sql="SELECT Pedidos FROM carrito WHERE idUsuario='"+idCliente+"'";
            rs = smt.executeQuery(sql);
            while(rs.next()){
                numero++;
            }
            idProductos= new String[numero];
            rs = smt.executeQuery(sql);
            while(rs.next()){
                idProductos[i]=rs.getString(1);
                i++;
            }
        }catch (SQLException ex) {
            Logger.getLogger(CarritoIm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            nombreProductos= new String[idProductos.length];
            for(int f=0; f<nombreProductos.length; f++){
                smt = con.createStatement();
                String sql1="SELECT Nombre FROM productos WHERE idProductos='"+idProductos[f]+"'";
                rs = smt.executeQuery(sql1);
                while(rs.next()){
                    nombreProductos[f] =rs.getString(1);
                }
            }
        }catch (SQLException ex) {
            Logger.getLogger(CarritoIm.class.getName()).log(Level.SEVERE, null, ex);
        }
       return nombreProductos;
    }

    @Override
    public String[] Cantidad(String idCliente) {
        numero=0;
        i=0;
        try {
            smt = con.createStatement();
            String sql="SELECT Cantidad FROM carrito WHERE idUsuario='"+idCliente+"'";
            rs = smt.executeQuery(sql);
            while(rs.next()){
                numero++;
            }
            Cantidad= new String[numero];
            rs = smt.executeQuery(sql);
            while(rs.next()){
                Cantidad[i]=rs.getString(1);
                i++;
            }
            } catch (SQLException ex) {
            Logger.getLogger(CarritoIm.class.getName()).log(Level.SEVERE, null, ex);
        }
    return Cantidad;
    }

    @Override
    public String[] Precio(String idCliente) {
        numero=0;
        i=0;
        try{
        smt = con.createStatement();
            String sql="SELECT Pedidos FROM carrito WHERE idUsuario='"+idCliente+"'";
            rs = smt.executeQuery(sql);
            while(rs.next()){
                numero++;
            }
            idProductos= new String[numero];
            rs = smt.executeQuery(sql);
            while(rs.next()){
                idProductos[i]=rs.getString(1);
                i++;
            }
        }catch (SQLException ex) {
            Logger.getLogger(CarritoIm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Precio= new String[idProductos.length];
            for(int f=0; f<Precio.length; f++){
                smt = con.createStatement();
                String sql1="SELECT Precio FROM productos WHERE idProductos='"+idProductos[f]+"'";
                rs = smt.executeQuery(sql1);
                while(rs.next()){
                    Precio[f] =rs.getString(1);
                }
            }
        }catch (SQLException ex) {
            Logger.getLogger(CarritoIm.class.getName()).log(Level.SEVERE, null, ex);
        }
    return Precio;    
    }
}
