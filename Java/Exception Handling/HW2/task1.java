/*
 * Реализуйте метод, 
 * который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. 
 * Ввод текста вместо числа 
 * не должно приводить к падению приложения, 
 * вместо этого, 
 * необходимо повторно запросить у пользователя ввод данных.
 */

package Workshop2.HW2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Value = " + getFloat());
    }

    public static float getFloat(){           
        while (true){
            Scanner getLine = new Scanner(System.in);
            System.out.println("Enter float: ");
            String str = getLine.nextLine();

            try {
                float val = Float.parseFloat(str);
                getLine.close();
                return val;
            }
      
            catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
        
    }
}
