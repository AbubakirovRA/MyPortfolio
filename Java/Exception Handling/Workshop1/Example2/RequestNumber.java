package Example2;

import java.util.Scanner;

public class RequestNumber {

    public static int requestNumber(String message) {
        while (true) {
            System.out.print(message);
            Scanner input = new Scanner(System.in);
            String value = input.nextLine();
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                System.err.println("Value is wrong!");
            }

        }
    }
}
