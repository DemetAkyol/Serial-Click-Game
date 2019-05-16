/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialclickgame;

import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author student
 */
public class Gamer {

    public String TakmaAd;
    public int Point=10;
    private Socket client;
    private FrameBehavior1 myFrame;
    public MessageList myInputMessages;
    public MessageList myOutputMessages;
    public MessageList joined;
    public String width;
    public String height;

    private HandlerReciever handleInput;
    private HandlerSender handleOutput;
    private HandlerNickName handleNickName;

    public Gamer(Socket socket, FrameBehavior1 frm,String nickName) {
        TakmaAd= nickName;
        client = socket;
        myFrame = frm;
        myInputMessages = new MessageList();
        myOutputMessages = new MessageList();
        joined = new MessageList();

        if (client != null) {
            handleInput = new HandlerReciever(socket, myInputMessages, frm, this);
            handleNickName = new HandlerNickName(socket, joined, frm, this);

            handleOutput = new HandlerSender(socket, myOutputMessages);
            handleNickName.start();
            handleInput.start();
            handleOutput.start();

        }
    }
}
