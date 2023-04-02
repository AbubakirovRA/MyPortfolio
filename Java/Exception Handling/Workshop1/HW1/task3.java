/*
 * 3) Реализуйте метод, 
 * принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, 
 * каждый элемент которого 
 * равен разности элементов 
 * двух входящих массивов 
 * в той же ячейке. 
 * Если длины массивов не равны, 
 * необходимо как-то оповестить пользователя.
 */

package HW1;

public class task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 8};
        System.out.println(diffArr(arr1, arr2)); 
    }

    public static int[] diffArr(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException ("Массивы не равны по размеру!");
        }
        int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = Math.abs(arr1[i] - arr2[i]);
            }
        return arr3;
    }

}