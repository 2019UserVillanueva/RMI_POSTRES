/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Interfaces;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author O-5-K
 */
public interface AltaCliente extends Remote {
   public void Alta(String Nombres, String Apellidos, String Direccion, String Correo, String Password)throws RemoteException; 
   
}
