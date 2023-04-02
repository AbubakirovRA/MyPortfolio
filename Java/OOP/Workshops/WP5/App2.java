package OOP.Workshops.WP5;

import java.util.ArrayList;

/**
 * App
 */
public class App2 {

  public static void main(String[] args) {
    ICQ icq = new ICQ();
    User client1 = new User("Michael", icq);
    User client2 = new User("Joann", icq);
    User client4 = new User("Ekaterine", icq);
    icq.appendClient(client1);
    icq.appendClient(client2);
    icq.appendClient(client4);
    client1.sendMsg("Я изучаю ООП!");
    client2.sendMsg("Всем здоровья!");
    User client3 = new User("Владимир", icq);
    icq.appendClient(client3);

    client3.sendMsg("hello world!");
  }
}

class User {
  public User(String name, Chat chatroom) {
    this.name = name;
    this.chatroom = chatroom;
  }

  String name;
  private Chat chatroom;

  void printMessage(String msg) {
    System.out.printf("Чат> %s: %s\n", name, msg);
  }

  void sendMsg(String text) {
    chatroom.sendMessage(text, this);
  }

  public char[] getStatus() {
    return null;
  }

public void setStatus(Status admin) {
}

public String getLogin() {
    return null;
}
}

class ICQ implements Chat {

  ArrayList<User> users = new ArrayList<>();

  @Override
  public void sendMessage(String text, User me) {

    for (User user : users) {
      if (user.name != me.name) {
        user.printMessage(text);
      }
    }
  }

  @Override
  public void appendClient(User client) {
    System.out.println("\n >>> добавился " + client.name);
    users.add(client);

  }
}

interface Chat {
  void sendMessage(String msg, User user);

  void appendClient(User user);

static Status getStatus() {
    return null;
}
}