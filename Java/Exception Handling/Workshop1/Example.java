/**
 * example
 * В основном компилятор проверяет правую часть от оператора присваивания и, 
 * исходя из нее, определяет конкретный тип переменной, а затем заменяет им var.
 * Это полезно для сокращения многословности шаблонного кода, 
 * а так же позволяет ускорить сам процесс программирования. 
 * Например, очень удобно писать 
 *                              var evenAndOdd =... 
 * вместо 
 *                              Map<Boolean, List<Integer>> evenAndOdd =... .
 */
public class Example {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5}; //здесь возможно объявление переменной при помощи типа var
        int length = checkArrayLength(ints, 6);

        if (length == -1) {
            System.err.println("Array's length is less the min");
        }else{
            System.out.println("Array length is " + length);
        }
    }

    public static int checkArrayLength(int[] array, int minLength){
        if (array.length < minLength){
            return -1;
        }
        return array.length;
    }
}