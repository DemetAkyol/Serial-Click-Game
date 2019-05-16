/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialclickgame;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class ServerListener extends Thread {
     private int portNumber;
    private int clientCount;
    private FrameBehavior1 myFrm;
    private ServerSocket serverSocket;
    private String nickName;
    public ServerListener(String port, FrameBehavior1 mFrm,String nickName)
    {
        portNumber = Integer.parseInt( port);
        serverSocket = null;
        clientCount = 1;
        Gamer g1 = new Gamer(null, mFrm,"asd");
        Info.clients = new ArrayList<Gamer>();
        Info.clients.add(g1);
        myFrm = mFrm;
        this.nickName=nickName;
    }
       
    public void run(){
        try
        {
            serverSocket = new ServerSocket(portNumber);
        }
        catch (IOException ioEx)
        {
                System.exit(1);
        }
        
        do
        {
            try {
                Socket client = serverSocket.accept();
                Gamer newGamer = new Gamer(client, myFrm,nickName);
                Info.clients.add(newGamer);
                clientCount++;
            } catch (IOException ex) {
                Logger.getLogger(ServerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }while(clientCount <= 5);
        
             
    }
}
