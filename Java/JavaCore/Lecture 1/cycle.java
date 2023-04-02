/**
Циклы
Цикл — это многократное выполнение одинаковой последовательности действий.

В java доступны следующие циклы:
цикл while;
цикл do while;
цикл for; и его модификация for in

 */
public class cycle { 
    public static void main(String[] args) { // Цикл while
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }
    

    public static void main1 (String[] args) { //Цикл do while
        int value = 321;
        int count = 0;

        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }

    public static void main2(String[] args) { //Оператор цикла for

        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
    }

    public static void main3(String[] args) { //Вложенные циклы
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
}}

/*
continue, break
Операторы для управления циклами — continue и break.
Выполнение следующей итерации цикла — continue.
Прерывание текущей итерации цикла — break. 
* ближайшего к оператору
*/