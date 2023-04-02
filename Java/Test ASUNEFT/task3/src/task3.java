package task3.src;

import java.util.Arrays;

/*task 3
 * Создать массив из 20 элементов 
 * в диапазоне значений от -15 до 14 включительно
 * (случайным образом). 
 * Определить количество элементов 
 * по модулю больших, чем максимальный.
 */

public class task3 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int max = arr[0];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = getIntRnd.rndGenerator(-15, 14);
            if (arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max){
                num +=1;
            }
        }

        System.out.println("Max element - " + max);
        System.out.println("Quantity greater elements - " + num);
    }
}
