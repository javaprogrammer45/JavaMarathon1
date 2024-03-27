package day13;

import java.util.ArrayList;
import java.util.List;

import static day13.MessageDatabase.getMessages;

public class User {
    private String username;
    private List<User> subscriptions;


    public User(String username) {
        this.username = username;
        List<User> subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }


    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {

        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
