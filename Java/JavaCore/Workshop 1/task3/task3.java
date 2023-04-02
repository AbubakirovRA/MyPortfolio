/**
 * task3
 */
import java.util.Scanner;
public class task3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter int n: ");
        int x = iScanner.nextInt();
        iScanner.close();
        System.out.printf("Triangle number for n= %s:\n", x);
        System.out.printf("T%s = %s", x, 0.5*x*(x+1));
    }
}