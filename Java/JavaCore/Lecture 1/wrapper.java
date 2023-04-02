public class wrapper {
    public static void main(String[] args){
        int i = 23_123_34; // разряды числа для наглядности можно отделять друг от друга нижним подчеркиванием
        System.out.println(i);
        String s = "qwer";
        char ch = s.charAt(3);
        System.out.println(ch);
        System.out.println(Integer.MAX_VALUE); // Здесь INTEGER - класс-обертка, позволяющая вызывать встроенные методы для типа int.
    }
}
