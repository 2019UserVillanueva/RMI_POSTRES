/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.TotalCarrito;
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
public class TotalCarritoIm extends UnicastRemoteObject implements TotalCarrito{
        public TotalCarritoIm() throws RemoteException{}

    int[] productos, cantidad, precios;
    private static Statement smt;
    Conexion db = new Conexion();
    Connection con =db.getCon();
    int total,numero,i=0;
    private static ResultSet rs;
    
    @Override
    public int Total(int idUsuario) {
        try{
            smt = con.createStatement();
            String sql="SELECT Pedidos FROM carrito WHERE idUsuario='"+idUsuario+"'";
            rs = smt.executeQuery(sql);
            while(rs.next()){
                numero++;
                //System.out.println(numero);
            }
            productos= new int[numero];
            rs=smt.executeQuery(sql);
            while(rs.next()){
                productos[i]=rs.getInt(1);
//                System.out.println(productos[i]);
                i++;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        try{
            precios= new int[productos.length];
            for (int b=0; b<productos.length; b++){
                smt = con.createStatement();
                String sql="SELECT Precio FROM productos WHERE idProductos='"+productos[b]+"'";
                rs=smt.executeQuery(sql);
                while(rs.next()){
                    precios[b]=rs.getInt(1);
//                    System.out.println(productos[b]+" "+precios[b]);
                }
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        try{
            cantidad= new int[productos.length];
            for (int b=0; b<productos.length; b++){
                smt = con.createStatement();
                String sql="SELECT Cantidad FROM carrito WHERE idUsuario='"+idUsuario+"' and Pedidos='"+productos[b]+"'";
                rs=smt.executeQuery(sql);
                while(rs.next()){
                    cantidad[b]=rs.getInt(1);
//                    System.out.println(productos[b]+" "+precios[b]+" "+cantidad[b]);
                }
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        for(int i=0; i<productos.length; i++){
            total= total+(precios[i]*cantidad[i]);
//            System.out.println(precios[i]+", "+ cantidad[i]);
        }
    return total;
    }   
}
