/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;
import Database.Conexion;
import Database.Interfaces.ListaTipoIn;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author O-5-K
 */
public class ListaTipos extends UnicastRemoteObject implements ListaTipoIn{
        public ListaTipos() throws RemoteException{}

    int numero=0;
    
    private static Statement smt;
    Conexion db = new Conexion();
    Connection con =db.getCon();
    String a[];
    private static ResultSet rs;
    int i=0;
    
    @Override
    public String[] lista(){
        try{
            smt = con.createStatement();
            String sql="SELECT tipodepostre FROM tipo";
            rs = smt.executeQuery(sql);
            while(rs.next()){
                numero++;
                //System.out.println(numero);
            }
            a= new String[numero];
            rs=smt.executeQuery(sql);
            while(rs.next()){
                a[i]=rs.getString(1);
                //System.out.println(a[i]);
                i++;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return a;
    } 
    
}
