/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;
import Database.Conexion;
import Database.Interfaces.AltaCliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author O-5-K
 */
public class AltaClienteIm extends UnicastRemoteObject implements AltaCliente{
    public AltaClienteIm() throws RemoteException{}
        private static Statement smt;
        Conexion db = new Conexion();
        Connection con =db.getCon();
    @Override
    public void  Alta(String Nombres, String Apellidos, String Direccion, String Correo, String Password){
        try {
            smt = con.createStatement();
            String sql;
            sql="INSERT INTO `pasteles`.`usuario` (`Nombres`, `Apellidos`, `Direccion`, `Correo`, `Password`) VALUES ('"+Nombres+"', '"+Apellidos+"', '"+Direccion+"', '"+Correo+"', '"+Password+"');";
                smt.executeUpdate(sql);
            //System.out.println("Exito");
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    
}
