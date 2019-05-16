/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialclickgame;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class HandlerReciever extends Thread {

    private Socket client;
    private Scanner input;
    //  private PrintWriter output;
    private MessageList myMessages;
    private FrameBehavior1 myFrame;
    private Gamer me;

    public HandlerReciever(Socket socket, MessageList msg,
            FrameBehavior1 frm, Gamer c) {

        client = socket;
        myMessages = msg;
        myFrame = frm;
        me = c;
        try {
            input = new Scanner(client.getInputStream());
        } catch (IOException ioEx) {
        }
    }

    public void run() {
        String received;
        do {

            received = input.nextLine();
            if (received != null && received != "") {
                String[] mParsed = received.split("\\+");;
                if (mParsed[0].equals("nick")) {

                    myFrame.sendGamer(received, me);

                } else if (mParsed[0].equals("Start")) {
                    myFrame.starteGame(received);

                }else if (mParsed[0].equals("click")) {
                    myFrame.makeAction(received,me);

                }else if (mParsed[0].equals("point")) {
                    
                     String[] mParsed1 = mParsed[1].split("\\*");;
                    
                    myFrame.updatePoint(Integer.parseInt(mParsed1[0]),mParsed1[1] );

                }   else {
                    myFrame.makeAction(received, me);
                }
            }
            received = "";

        } while (!received.equals("QUIT"));

        try {
            if (client != null) {
                System.out.println("Closing down connection...");
                client.close();
            }
        } catch (IOException ioEx) {
            System.out.println("Unable to disconnect!");
        }
    }
}
