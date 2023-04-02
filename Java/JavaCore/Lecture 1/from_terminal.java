// ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА

import java.util.Scanner; //импорт библиотеки Scanner
public class from_terminal {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        
        //считывание строки
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);

        System.out.println();
       
        // считывание примитивов
        System.out.printf("int a: ");
        boolean flag_int = iScanner.hasNextInt();
        System.out.println(flag_int);
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        boolean flag_doubl = iScanner.hasNextDouble();
        System.out.println(flag_doubl);
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);

        iScanner.close();
    }
}
