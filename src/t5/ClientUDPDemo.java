/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class ClientUDPDemo {
    public static void main(String[] args) {
        try {
            byte[] b = new byte[10];
            DatagramSocket s = new DatagramSocket(8888);
            DatagramPacket packet = new DatagramPacket(b, b.length);
            System.out.println("Client is ready");
            s.receive(packet);
            String mess = new String(packet.getData());
            System.out.println("Client reveive: " + mess);
        } catch (SocketException ex) {
            Logger.getLogger(ClientUDPDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientUDPDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
