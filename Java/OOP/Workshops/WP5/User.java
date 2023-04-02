package OOP.Workshops.WP5;

public class User {
    private int id;
    public String name;
    private Status status;
    private static int flag = 1;

    public User(String name){
        this.name = name;
        id = flag++;
    }

    public int getId(){
        return id;
    }

    public String getLogin(){
        return name;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
}
