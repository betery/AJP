/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t6;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface iCaculator extends Remote {
    
    int cong(int a, int b) throws RemoteException;
}
