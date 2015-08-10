/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class ServerUDPDemo {
    public static void main(String[] args) {
        try {
            InetAddress host = InetAddress.getLocalHost();
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket packet = new DatagramPacket(
                    "Hello".getBytes(), 4, host, 8888);
            socket.send(packet);
        } catch (SocketException ex) {
            Logger.getLogger(ServerUDPDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ServerUDPDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServerUDPDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
