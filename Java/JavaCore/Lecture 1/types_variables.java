public class types_variables {
    public static void main(String[] args) {
        char ch = 123; //Здесь в переменной все равно будет хранится символ "{"
        char ch1 = '{';

        //Результат вывода будет одинаковый, так как происходит неявное преобразование типов.
        System.out.println(ch);
        System.out.println(ch1);
    }
}
