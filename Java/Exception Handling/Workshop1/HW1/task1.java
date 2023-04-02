/* task1
1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения 
*/
package HW1;

public class task1 {
    public static void main(String[] args) {
        // divByZero();
        // arrayException();
        myRunException(5, 0);
    }

    public static void divByZero(){
        System.out.println(5/0);
    }

    public static void arrayException(){
        int[] arr = new int[5];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
    }

    public static void myRunException(int a, int b){
        if (b == 0){
            throw new RuntimeException("Деление на 0!");
        }
        System.out.println(a/b);
    }
    
}
