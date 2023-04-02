package OOP.Workshops.WP4.ToDoPlanner.Model;
import java.util.ArrayList;

import OOP.Workshops.WP4.ToDoPlanner.ExportImport.Loader;
import OOP.Workshops.WP4.ToDoPlanner.ExportImport.Saver;

public interface TaskRepo<T extends Task> {
    void add(T task);

    T getById(int id);

    ArrayList<T> getByName(String name);

    ArrayList<T> getAll();

    void updateById(int id, T task);

    void removeById(int id);

    boolean save(Saver format, String path);

    boolean load(Loader format, String path);

}
