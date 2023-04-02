package OOP.Workshops.WP3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        // #region Collections.sort(numbers);
        // List<Integer> numbers = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        // numbers.add(r.nextInt(1,20));
        // }

        // System.out.println(numbers);
        // Collections.sort(numbers);
        // System.out.println(numbers);
        // #endregion

        // #region Comparable<Person>
        // List<Person> db = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        // db.add(new Person("Имя " + i, "Фамилия " + i, r.nextInt(18,31),
        // r.nextInt(10000)));
        // }
        // System.out.println(db);

        // Collections.sort(db);
        //// Array.sort(...)

        // System.out.println(db);

        // #endregion

        // #region Comparable<Person>

        List<Person> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Person("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
        }
        System.out.println(db);

        db.sort(new AgeComparator());

        System.out.println(db);

        // #endregion

        //#region

        Person w1 = new Person("Имя", "Фамилия", 20, 20);
        Person w2 = new Person("Имя", "Фамилия", 20, 20);
        
        //#endregion

    }
}