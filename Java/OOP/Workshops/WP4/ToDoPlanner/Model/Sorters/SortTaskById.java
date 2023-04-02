package OOP.Workshops.WP4.ToDoPlanner.Model.Sorters;

import java.util.Comparator;

import OOP.Workshops.WP4.ToDoPlanner.Model.Task;

public class SortTaskById implements Comparator<Task>{

    @Override
    public int compare(Task o1, Task o2) {
        return o1.getId() - (o2.getId());
    }
    
}
