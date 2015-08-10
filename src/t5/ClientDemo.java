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
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class ClientDemo {
    public static void main(String[] args) {
        try (Socket s = new Socket("LocalHost", 8889)){
            System.out.println("Connected");
            
            PrintWriter out = new PrintWriter(
                    s.getOutputStream(), true);
            
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            
            out.println("Hello");
            String mess = in.readLine();
            System.out.println("Server say: " + mess);
        } catch (IOException ex) {
            Logger.getLogger(ClientDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
