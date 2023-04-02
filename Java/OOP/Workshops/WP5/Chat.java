package OOP.Workshops.WP5;

import java.util.ArrayList;
import java.util.List;

public abstract class Chat extends ChatsList{
    List<Chat> Rooms = new ArrayList<>(); //чаты

    abstract void appendToChat(User user);
}
