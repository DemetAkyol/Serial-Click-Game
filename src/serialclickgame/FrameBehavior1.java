/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialclickgame;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author student
 */
public interface FrameBehavior1 {
    
    
    
     public void makeAction(String msg, Gamer sender);
     public void sendGamer(String nickName, Gamer sender);

    public void starteGame(String receıved );
    public void updatePoint(int point, String win );

}
