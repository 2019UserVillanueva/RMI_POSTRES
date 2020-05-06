/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author O-5-K
 */
public class Conexion {
    Connection conexion=null;
   public Connection getCon(){
    try{
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            conexion = DriverManager.getConnection ("jdbc:mysql://localhost/pasteles","root", "root");
//            Statement s = conexion.createStatement();     
//            // Se realiza la consulta. Los resultados se guardan en el 
//            // ResultSet rs
//            ResultSet rs = s.executeQuery ("SELECT Correo FROM usuario WHERE idUsuario = 2");
//            // Se recorre el ResultSet, mostrando por pantalla los resultados.
//            while (rs.next()){
//                System.out.println (rs.getString("Correo"));
//            }
//            conexion.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    return conexion;
    }
}


