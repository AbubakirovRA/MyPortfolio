/*
 * Разработайте программу, 
 * которая выбросит Exception, 
 * когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, 
 * что пустые строки вводить нельзя
 */

package Workshop2.HW2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws Exception{
        Scanner line = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = line.nextLine();
        line.close();    

        try{
            if (str == ""){
                str = null;
            }
            System.out.println("You entered " + str.length() + " simbols");
        }      

        catch (Exception e){
            System.out.println("Strig must have at least one symbol \n" + e);
        }
    }
}
