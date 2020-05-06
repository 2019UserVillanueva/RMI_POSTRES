/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.EliminarCarrito;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author O-5-K
 */
public class EliminarCarritoIm implements EliminarCarrito{
    int[] numer;
    private static Statement smt;
    Conexion db = new Conexion();
    Connection con =db.getCon();
    private static ResultSet rs;
    String aux;
    String[] a;
    @Override
    public String[] numerpProducto(int idcarrito) {
        int posicion, contador = 0;
        try {
            smt = con.createStatement();
            String sql = "SELECT Pedidos FROM carrito WHERE idUsuario = '"+idcarrito+"'";
            rs = smt.executeQuery(sql);
            while(rs.next()){
                aux = rs.getString(1);
            }
            posicion = aux.indexOf(",");
            while (posicion != -1) { 
                contador++;
                posicion = aux.indexOf(",", posicion + 1);
            }
            a= new String[contador];
            a= aux.split(",");
            System.out.println(a[1]);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return a;
    }

    @Override
    public void EliminarPro(String[] numPro, int posicion) {
      
        
    }
    
}
