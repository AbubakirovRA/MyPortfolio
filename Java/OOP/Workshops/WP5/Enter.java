package OOP.Workshops.WP5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Enter {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Rooms chat = new Rooms(buffer.readLine());
        User user1 = new User(buffer.readLine());
        User user2 = new User(buffer.readLine());
        User user3 = new User(buffer.readLine());
        chat.appendToChat(user1);
        chat.appendToChat(user2);
        chat.appendToChat(user3);

        chat.sendMessage(user1, "Hi! Friends!");
        System.out.println(chat.getMessages().size());
        System.out.println(user2.getStatus());
    }
}