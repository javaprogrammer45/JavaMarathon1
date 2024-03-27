package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Andrey");
        User user2 = new User("Bob");
        User user3 = new User("Sam");

        user1.sendMessage(user2, "Привет! ");
        user1.sendMessage(user2, "Ты нашёл ментора (Java)? ");
        user2.sendMessage(user1, "Hello!");
        user2.sendMessage(user1, "Да, нашёл и получил оффер от английской фирмы. ");
        user2.sendMessage(user1, "С рилокейтом!");
        user3.sendMessage(user1, "Добрый день!!!");
        user3.sendMessage(user1, "Ты освоил фрэймворк \"Spring\"?");
        user3.sendMessage(user1, "Над каким проектом сейчас работаешь?");
        user1.sendMessage(user3, "Добрый !!!");
        user1.sendMessage(user3, "Осваиваю.");
        user1.sendMessage(user3, "ПО для банкомата.");
        user3.sendMessage(user1, "Супер. Ты будешь хорошим программистом!");

        MessageDatabase.showDialog(user1, user3);

    }
}
