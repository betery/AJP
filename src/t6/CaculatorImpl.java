/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t6;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CaculatorImpl extends UnicastRemoteObject implements iCaculator{

    public CaculatorImpl() throws RemoteException {}
    
    @Override
    public int cong(int a, int b) throws RemoteException {
        System.out.println("Add");
        return a + b;
    }
    
//    public int add (int a) throws RemoteException {
//        return a;
//    }
}
