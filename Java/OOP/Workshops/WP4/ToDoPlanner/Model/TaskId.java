package OOP.Workshops.WP4.ToDoPlanner.Model;

public abstract class TaskId {
    private static int id;

    public static int nextId(){
        return ++id;
    }
}