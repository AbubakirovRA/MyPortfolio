package task4.src;

import java.util.Scanner;

public class getInt {

    public static int request(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Integer digit");
            
            try{
                int ch = scanner.nextInt();
                scanner.close();         
                return ch;
            }
    
            catch (Exception e){
                    System.out.println("Wrong input!" + e);
            }
        }
    }
}
