
/*
Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
Пример 1: а = 3, b = 2, ответ: 9 
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5
входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000
*/
/**
 * task1
 */
import java.io.*;

public class task1 {
    public static void main(String[] args) throws Exception {
        send_data(pow(get_data(args))); // pow - метод решающий задачу
    }

    // метод возведения в степень
    public static String pow(String args) {
        int[] arr = separator(args);
        int b = arr[0];
        double a = arr[1];
        double result = 1;
        if (a == 0 && b == 0) {
            return "неопределенность или 1";
        } else if (a == 0) {
            return Double.toString(a);
        } else if (a == 1) {
            return Double.toString(a);
        }
        if (b < 0) {
            b = -b;
            a = 1 / a;
        }
        // while (b != 0) { /*сокращаем количество операций путем преобразования показателя степени к виду:
        //     a в квадрате, либо a в первой, что равносильно просто умножению результата на a;*/
        //     if (b % 2 == 0) {//заходим, если степень четная
        //         b /= 2;//делим степень пополам
        //         a *= a;//возводим число а в квадрат
        //     } else { //заходим, если степень нечетная
        //         b = (b - 1) / 2;//делаем ее четной
        //         result *= a;//результат умножаем на а, что равносильно умножению на а в первой степени
        //         a *= a; //аргумент возводим в квадрат
        //     }
        // }
        result = recpow(a, b);
        return Double.toString(result);
        // return String.format("(%s, %s)", b, a); - возврат кортежа значений
    }

    public static double recpow(double x, int n){ 
        return (n == 1) ? x : (x * recpow(x, n - 1));// решение при помощи рекурсивной функции, тернарная запись
    }

    // метод вычленения чиел из считанной из файла строки
    public static int[] separator(String args) {
        int i = 0;
        int[] arr = new int[2];
        String str = "";
        while (args.charAt(i) != 97) {
            if (Character.isDigit(args.charAt(i)) || (args.charAt(i) == 45)) {
                str += (args.charAt(i));
            }
            i++;
        }
        arr[0] = Integer.parseInt(str);
        str = "";
        while (i < args.length()) {
            if (Character.isDigit(args.charAt(i))) {
                str += (args.charAt(i));
            }
            i++;
        }
        arr[1] = Integer.parseInt(str);
        return arr;
    }

    // чтение данных из файла
    public static String get_data(String[] args) throws Exception { // объявляем исключение Exception
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;
        String res = "";
        try { // в блок try заключаем код, в котором может произойти исключение
            while ((str = br.readLine()) != null) {
                res += str;
            }
        } catch (IOException ex) { // в блок catch заключаем код по обработке исключения IOException
            System.out.println(ex.getMessage());
        }
        br.close();
        return res;
    }

    // запись в файл
    public static void send_data(String string) throws Exception {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.write(string);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// double v = 1d; // вариант возведения в степень при помощи побитового сдвига
// while(e > 0) {
// if((e & 1) != 0) {
// v *= b;
// }
// b *= b;
// e >>= 1;
// }
// return v;
// }
