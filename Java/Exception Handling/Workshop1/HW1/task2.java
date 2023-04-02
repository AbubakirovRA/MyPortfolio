/* task2
* 2) Посмотрите на код, и подумайте 
сколько разных типов исключений вы тут сможете получить?

Ответ: код парсит строковую матрицу, на предмет наличия целых чисел, затем все найденные числа суммирует.
Соответственно, если в матрице будут не целочисленные значени то будет выкидываться исключение типа NumberFormatException.
Это будет происходить каждый раз, когда найденное значение будет отлично от целочисленного или со значениями типа null.
Также будет выводиться исключение ArrayIndexOutOfBoundsException если матрица будет пуста.
*/

package HW1;

public class task2 {
    public static void main(String[] args) {
        String[][] arr = {{null}, {null}};
        sum2d(arr);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
    return sum;
    }
}
