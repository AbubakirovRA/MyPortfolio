package OOP.Workshops.WP4.ToDoPlanner.ExportImport;

import java.util.ArrayList;

import OOP.Workshops.WP4.ToDoPlanner.Model.Task;

public interface Loader {
    ArrayList<Task> load(String path);
}
