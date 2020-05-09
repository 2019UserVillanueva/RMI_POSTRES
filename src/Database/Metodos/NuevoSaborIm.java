/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.NuevoSabor;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author O-5-K
 */
public class NuevoSaborIm implements NuevoSabor{
    private static Statement smt;
    Conexion db = new Conexion();
    Connection con =db.getCon();
    
    @Override
    public void agregar(String Sabor) {
        try {
            smt = con.createStatement();
            String sql;
            sql="INSERT INTO `pasteles`.`sabor` (`Sabor`) VALUES ('"+Sabor+"');";
                smt.executeUpdate(sql);
            //System.out.println("Exito");
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
