/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Metodos;

import Database.Conexion;
import Database.Interfaces.EditarProducto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author O-5-K
 */
public class EditarProductoIm implements EditarProducto{
int numero=0;
    private static Statement smt;
    Conexion db = new Conexion();
    Connection con =db.getCon();
    String a[];
    int i=0;
    
    @Override
    public void Editpro(int idProducto, String Sabor, String Nombre, String idTipo, String Descripcion, int stock, int precio) {
        try {
            smt = con.createStatement();
            String sql;
            sql="UPDATE `pasteles`.`productos` "
           + "SET `IdSabor`='"+Sabor+"', `Nombre`='"+Nombre+"', `IdTipo`='"+idTipo+"', `Descripcion`='"+Descripcion+"', `stock`='"+stock+"', `Precio`='"+precio+"' "
           + "WHERE  `idProductos`="+idProducto+";";
                smt.executeUpdate(sql);
            //System.out.println("Exito");
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
