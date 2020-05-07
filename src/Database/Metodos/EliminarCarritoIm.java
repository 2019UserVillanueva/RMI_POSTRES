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
    public void EliminarPro(int idCarrito) {
        try {
            smt = con.createStatement();
            String sql;
            sql="DELETE FROM `pasteles`.`carrito` WHERE  `idCarrito`="+idCarrito+";";
            smt.execute(sql);
            //System.out.println("Exito");
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
