package OOP.Workshops.WP5;

import java.util.ArrayList;
import java.util.List;

public class Rooms extends Chat implements Message {
    private List<User> users;
    private List<String> messages;
    private String chatId;

    public Rooms(String chatId){
        this.chatId = chatId;
        users = new ArrayList<>();
        messages = new ArrayList<>();
        Rooms.add(this);
    }

    public List<User> getUsers(){
        return users;
    }

    public List<String> getMessages(){
        return messages;
    }

    @Override
    void appendToChat(User user){
        users.add(user);
        if (users.size() == 1) {
            user.setStatus(Status.Admin);
        } else {
            user.setStatus(Status.Member);
        }
    }
    
    @Override
    public void sendMessage(User user, String msg) {
        System.out.printf("%s", user.getLogin() + ": "+ msg + "\n");
        messages.add(user.getLogin() + ": " + msg);
    }

    /**
     * удаление из чата
     * @param status1
     * @param status2
     */
    public void deleteUser(User status1, User status2) {
        if(status1.getStatus() == Status.Admin) {
            users.remove(status2);
        } else {
            System.out.println("Нет прав на данное действие");
        }
    }

    /**
     * изменение статуса администратора
     * @param status1
     * @param status2
     */
    public void changeModerator(User status1, User status2) {
        if(status1.getStatus() == Status.Admin) {
            status1.setStatus(Status.Member);
            status2.setStatus(Status.Admin);
        } else {
            System.out.println("Нет прав на данное действие");
        }
    }
}


