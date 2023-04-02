package OOP.Workshops.WP4;

import OOP.Workshops.WP4.ToDoPlanner.Model.ArrayListTaskRepo;
import OOP.Workshops.WP4.ToDoPlanner.Model.Task;
import OOP.Workshops.WP4.ToDoPlanner.Model.TaskRepo;
import OOP.Workshops.WP4.ToDoPlanner.Presenter.Presenter;
import OOP.Workshops.WP4.ToDoPlanner.View.ConsoleView;
import OOP.Workshops.WP4.ToDoPlanner.View.View;

public class Program {

    public static void main(String[] args) {
        Presenter<TaskRepo<Task>, View> p1 = new Presenter<TaskRepo<Task>, View>(new ArrayListTaskRepo(),
                new ConsoleView());

        p1.start();
    }
}