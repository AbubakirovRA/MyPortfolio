package task4.src;
/*
 * Написать функцию, 
 * которая определяет количество разрядов 
 * введенного целого числа.
 */

public class task4 {
    public static void main(String[] args){
        int num = getInt.request();
        if (num < 0) num = num * -1;
        System.out.println("Numbers of digits - " + foo.numDigits(num));
    }
}
