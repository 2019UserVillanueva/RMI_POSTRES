/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Interfaces;

/**
 *
 * @author O-5-K
 */
public interface EliminarCarrito {
    
    public String[] numerpProducto(int idcarrito);
    public void EliminarPro(String[] numPro,  int posicion);
    
}
