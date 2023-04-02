/**
 2. Сгенерировать все перестановки числа, состоящего из K цифр (от 0 до К-1), 
 где N - количество цифр участвующих в перестановке.

 Пример: N = 2, K = 3 
 ответ "00 01 02 10 11 12 20 21 22"
 */
import java.util.Arrays;
import java.util.Scanner;
public class shift {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter K: ");
        int k = iScanner.nextInt();
        System.out.println("Enter N: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int[] nums = new int[n];
        recShift(nums, 0, k);
    }

    private static void recShift(int[] array, int index, int k) {
        if (index == array.length){
            System.out.println(Arrays.toString(array));
            return;
        }
        
        for (int i = 0; i < k; i++){
            array[index] = i;
            recShift(array, index + 1, k);
        }
    }
}   