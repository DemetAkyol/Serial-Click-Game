/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialclickgame;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author student
 */
public class HandlerSender extends Thread{
    private Socket client;
  
    private PrintWriter output;
    private MessageList myMessages;
    public HandlerSender(Socket socket , MessageList msg){
        client = socket;
        myMessages = msg;
        try
        {
            output = new PrintWriter(client.getOutputStream(),true);
        }
        catch(IOException ioEx)
        {
        }
    }
    
    public void run(){
        String message;
        do{
          message =  myMessages.take(); 
            output.println(message);
        }
        while(message !=  "QUIT");
        
        try
        {
            if (client!=null)
            {
                System.out.println("Closing down connection...");
                client.close();
            }
        }
        catch(IOException ioEx)
        {
                System.out.println("Unable to disconnect!");
        }
    }
}
