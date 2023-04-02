// Преообразование типов
public class conversion {
    public static void main(String[] args) {
        String s = "128"; // для byte не более 127
        byte b = Byte.parseByte(s); // явное преобразование типа String в byte
        System.out.println(b);
    }
}
