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
public interface Carrito extends Remote{
    public String[] Nombre(String idCliente)throws RemoteException;
    public String[] Cantidad(String idCliente)throws RemoteException;
    public String[] Precio(String idCliente)throws RemoteException;
    
}
