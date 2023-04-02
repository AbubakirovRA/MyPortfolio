/*Дан следующий код, исправьте его там, где требуется:

 * public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
     }
     public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
     }
 * здесь, решение заключается в том, 
 * что мы блок кода catch с суперклассом Throwable 
 * перемещаем после всех блоков catch с подклассами Throwable.
 * В этом случае блок Throwable будет перехватывать "броски",
 * только после того, как не смогли отработать 
 * блоки NullPointerException и IndexOutOfBoundsException.
 * Этакий последний рубеж обороны.
 */

package Workshop2.HW2;

import java.io.FileNotFoundException;

public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(a, b);
            int[] abc = { 1, 2 };
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..." + ex);
        }
     }
     
    public static void printSum(int a, int b) throws FileNotFoundException {
        System.out.println(a + b);
    }
     
}
