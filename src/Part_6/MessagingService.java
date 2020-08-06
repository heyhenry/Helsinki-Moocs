package Part_6;

import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> msg;

    MessagingService() {

        this.msg = new ArrayList<>();

    }

    public void add(Message message) {

        if(message.getContent().length() <= 280) {

            msg.add(message);

        }

    }

    public ArrayList<Message> getMessages() {

        return msg;

    }

    public static void main(String[] args) {

        // personal test to check if methods work accordingly
        MessagingService ms = new MessagingService();

        Message m = new Message("Jack", "I owe you a churro senor.");
        Message k = new Message("Lilo", "asdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjklaasdfghjkla");
        Message o = new Message("Jack", "I owe you a cherry cupcake senorita.");

        ms.add(m);
        ms.add(k);
        ms.add(o);

        System.out.println(ms.getMessages());

    }

}
