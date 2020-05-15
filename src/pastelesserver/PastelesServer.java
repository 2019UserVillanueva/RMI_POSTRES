/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastelesserver;

import Database.Metodos.AltaClienteIm;
import Database.Metodos.AltaPrductoIm;
import Database.Metodos.AltaTiendaIm;
import Database.Metodos.AñadirCarritoIm;
import Database.Metodos.CarritoIm;
import Database.Metodos.EditarProductoIm;
import Database.Metodos.EliminarCarritoIm;
import Database.Metodos.EliminarProductoIm;
import Database.Metodos.ListaSaboresIm;
import Database.Metodos.ListaTipos;
import Database.Metodos.LogIn;
import Database.Metodos.NuevoSaborIm;
import Database.Metodos.NuevoTipoIm;
import Database.Metodos.TotalCarritoIm;

import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author O-5-K
 */
public class PastelesServer {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){  
        try{
            Registry r= java.rmi.registry.LocateRegistry.createRegistry(1099);
                r.rebind("AltaCliente", new AltaClienteIm());
                r.rebind("AltaPrducto", new AltaPrductoIm());
                r.rebind("AltaTienda", new AltaTiendaIm());
                r.rebind("AñadirCarrito", new AñadirCarritoIm());
                r.rebind("EditarProducto", new EditarProductoIm());
                r.rebind("EliminarCarrito", new EliminarCarritoIm());
                r.rebind("EliminarProducto", new EliminarProductoIm());
                r.rebind("ListaSabores", new ListaSaboresIm());
                r.rebind("ListaTipos", new ListaTipos());
                r.rebind("Login", new LogIn());
                r.rebind("NuevoSabor", new NuevoSaborIm());
                r.rebind("NuevoTipo", new NuevoTipoIm());
                r.rebind("TotalCarrito", new TotalCarritoIm());
                r.rebind("Carrito", new CarritoIm());
                JOptionPane.showMessageDialog(null, "Servidor Conectado" );
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
