package serialclickgame;

import java.util.concurrent.ArrayBlockingQueue;

public class MessageList {

    private ArrayBlockingQueue<String> myQueue;

    public MessageList() {
        myQueue = new ArrayBlockingQueue<String>(1000);
    }

    public synchronized void add(String newMessage) {
        myQueue.add(newMessage);
        notifyAll();
    }

    public synchronized String take() {
        try {
            while (myQueue.size() == 0) {
                wait(); //gönderilecek bir mesaj yoksa socket threadini beklet.
            }
            return myQueue.poll();

        } catch (Exception e) {
            return e.getMessage();
        }
    }

}
