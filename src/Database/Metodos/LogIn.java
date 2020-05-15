/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.Loging;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author O-5-K
 */
public class LogIn extends UnicastRemoteObject implements Loging {
        public LogIn() throws RemoteException{}

    int[] a= new int [2];
    private static Statement smt;
    Conexion db = new Conexion();
    Connection con =db.getCon();
    private static ResultSet rs;
    
    @Override
    public int[] Log(String Correo, String Password) {
        String aux=null;
        String aus=null;
         try {
            smt = con.createStatement();
            String sql = "SELECT Password FROM usuario WHERE Correo = '"+Correo+"'";
            rs = smt.executeQuery(sql);
            while(rs.next()){
                aux = rs.getString(1);
                System.out.println(aux);
            }
            if(Password.equals(aux)){
                a[0]=1;
                smt = con.createStatement();
                sql = "SELECT idUsuario FROM usuario WHERE Correo = '"+Correo+"'";
                rs = smt.executeQuery(sql);
                while(rs.next()){
                    a[1] = Integer.parseInt(rs.getString(1));
                }
            }else{
                String sql1 = "SELECT Password FROM tienda WHERE Correo = '"+Correo+"'";
                rs = smt.executeQuery(sql1);
                while(rs.next()){
                aus = rs.getString(1);
                } 
                if(Password.equals(aus)){
                    a[0]=2;
                    sql1 = "SELECT idTienda FROM tienda WHERE Correo = '"+Correo+"'";
                    rs = smt.executeQuery(sql1);
                    while(rs.next()){
                        a[1] = Integer.parseInt(rs.getString(1));
                    } 
                }else{
                    JOptionPane.showMessageDialog(null, "Mal Vuelve a Intentar", "Error", JOptionPane.DEFAULT_OPTION, null);        
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return a;
    }
}
