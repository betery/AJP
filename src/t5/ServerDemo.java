/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class ServerDemo {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(8889)){
            System.out.println("Server is running...");
            Socket s = ss.accept();
            InetAddress client = s.getInetAddress();
            System.out.println(client.getHostName() + " is connected");
            
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            String mess = in.readLine();
            System.out.println("Client say: " + mess);
            
            PrintWriter out = new PrintWriter(
                    s.getOutputStream(), true);
            out.println("Hi");
        } catch (IOException ex) {
            Logger.getLogger(ServerDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
