package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static


    List<Message> messages = new ArrayList<>();


    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message h : messages) {
            if (h.getSender().equals(u1) && h.getReceiver().equals(u2) || h.getSender().equals(u2) && h.getReceiver().equals(u1)) {
                System.out.println(h.getSender() + ":" + h.getText());
            }
        }
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}





















