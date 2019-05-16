package serialclickgame;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.DefaultListModel;

public class HandlerNickName extends Thread{
    private Socket client;
    private Scanner input;
    private PrintWriter output;
    private MessageList myMessages;
    private FrameBehavior1 myFrame;
    private Gamer me;
    public HandlerNickName(Socket socket , MessageList msg , FrameBehavior1 frm , Gamer g)
    {
        client = socket;
        myMessages = msg;
        myFrame = frm;
        me = g;
        try
        {
            output = new PrintWriter(client.getOutputStream(),true);
        }
        catch(IOException ioEx)
        {
        }
    } 
     
    @Override
   public void run()
    {
        String message;
        do
        {
            message =  myMessages.take(); 
            output.println(message);
            

        }while (true);

        
    } 
  
    
}
