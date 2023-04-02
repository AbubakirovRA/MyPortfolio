package task5.src;

import java.util.Scanner;

/* task 5
 * Пользователь последовательно вводит с клавиатуры числа в консоль. 
 * Как только пользователь ввел «пустую строку» 
 * вывести на экран сумму введенных чисел и завершить работу программы.
 */

public class task5 {
    public static void main(String[] args){
        double sum = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Enter number or 'empty string");
            String str = in.nextLine();
            

            try{
                if (str == "" || str.equals(" ")){
                    in.close();
                    break;
                }
                count +=1;
                sum += Double.parseDouble(str);
            }

            catch(Exception e){
                System.out.println("Wrong enter! " + e);
            }
        }
        System.out.println("Summ = " + sum / count);
    }

}
