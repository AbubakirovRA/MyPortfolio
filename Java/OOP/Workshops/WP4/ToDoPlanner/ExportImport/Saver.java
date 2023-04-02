package OOP.Workshops.WP4.ToDoPlanner.ExportImport;

import java.util.ArrayList;

import OOP.Workshops.WP4.ToDoPlanner.Model.Task;

public interface Saver {
    boolean save(ArrayList<Task> data, String path);
}
