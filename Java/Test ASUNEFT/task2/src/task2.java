package task2.src;
/*
 * С клавиатуры вводится натуральное число. 
 * Найти его наибольшую цифру.
 */

public class task2 {
    public static void main(String[] args){
        int num = getInt.request();
        int max = 0;
        while(num > 0){
            if (num % 10 > max){
                max = num % 10;
            }
            num /= 10;
        }
        System.out.println("Max Digit is " + max);
    }
}
