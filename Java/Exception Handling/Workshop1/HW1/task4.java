/*
 * 4) Реализуйте метод, 
 * принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, 
 * каждый элемент которого равен частному элементов 
 * двух входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 * Важно: При выполнении метода единственное исключение, 
 * которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

package HW1;

public class task4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 1, 6};
        System.out.println(diffArr(arr1, arr2)); 
    }

    public static int[] diffArr(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException ("Массивы не равны по размеру!");
        }
        int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0){
                    throw new RuntimeException ("Делитель равен 0!");
                }
                arr3[i] = Math.abs(arr1[i] / arr2[i]);
            }
        return arr3;
    }

}
