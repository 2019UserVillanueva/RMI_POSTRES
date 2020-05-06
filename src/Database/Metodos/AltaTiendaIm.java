/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.AltaTienda;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author O-5-K
 */
public class AltaTiendaIm implements AltaTienda {
        private static Statement smt;
        Conexion db = new Conexion();
        Connection con =db.getCon();
    @Override
    public void Alta(String Nombre, String Direccion, String Telefono, String Correo, String Password) {
        try {
            smt = con.createStatement();
            String sql="INSERT INTO `pasteles`.`tienda` (`Nombre`, `Direccion`, `Telefono`, `Correo`, `Password`) VALUES ('"+Nombre+"', '"+Direccion+"', '"+Telefono+"', '"+Correo+"','"+Password+"');";
                smt.executeUpdate(sql);
            //System.out.println("Exito");
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    
}
