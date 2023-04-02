/**
 * mass
 */
public class mass {

    public static void main(String[] args) {        // вывод массива в виде матрицы
        int[] arr[] = new int[5][10];
        for (int[] line : arr){
            for (int item : line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }
        // for (int i=0; i < arr.length; i++) {         // то же самое
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.printf("%d", arr[i][j]);
        //     }
        //     System.out.println();
        // }
    }
}