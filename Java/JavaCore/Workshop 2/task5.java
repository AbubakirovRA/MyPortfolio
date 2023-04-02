
/**
 * Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 * 
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class task5 {
    static char[] textGlobal;
    static List<Integer> signIndexesGlobal;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> signIndexes = new ArrayList<>();
        String text = "5? + 3? = ??";// уравнение в виде строки, мы не можем менять строки
        char[] textChar = text.replace(" ", "").toCharArray();
        // массив символов могу менять, вместо вопросиков поставить цифры

        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '+' || textChar[i] == '=') {
                textChar[i] = '-';
            }
            if (textChar[i] == '?') {
                signIndexes.add(i);
            }
        }

        textGlobal = textChar;
        signIndexesGlobal = signIndexes;

        combWithRep(new int[signIndexes.size()], 0, 10);
    }

    private static void combWithRep(int[] comb, int index, int K) {
        if (index == comb.length) {
            // готова очередная комбинация
            // здесь поставим на место вопросов комбинацию, проверим подходит или нет
            checkComb(comb);
            return;
        }

        for (int i = 0; i < K; i++) {
            comb[index] = i;
            combWithRep(comb, index + 1, K);
        }
    }

    public static void checkComb(int[] comb) {
        for (int i = 0; i < comb.length; i++) {
            // sign = 2, 5
            // comb = 1, 1
            textGlobal[signIndexesGlobal.get(i)] = Character.forDigit(comb[i], 10);
        }

        String[] numbers = String.valueOf(textGlobal).split("-");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a + b == c) {
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();
        }
    }

}

/**
 * Решение:
 * Задача решается методом перебора.
 * 1. Определяем сколько разрядов в первом числе.
 * 2. Определяем сколько разрядов во втором числе.
 * 3. Определяем какой разряд(ы) не известен(ны) в первом числе.
 * 4. Определяем какой разряд(ы) не известен(ны) во втором числе.
 * 5. Подставляем на место неизвестных разрядов первого числа 1.
 * 6. Подставляем на место неизвестных разрядов второго числа 1.
 * 7. Начиная с младшего разряда увеличиваем единицы в разрядах второго числа до
 * 0.
 * 8. На каждой итерации проверяем равенство. Если равенство верное - выдаем
 * ответ, выходим из программы.
 * 9. Иначе увеличиваем, начиная с младшего разряда, на единицу первое число.
 * 10. Повторяем шаги 7, 8.
 * 11. Если до сих пор ответ не найден, выдаем ответ, что решения нет.
 * // String st = "2? + ?5 = 69";
 * // st = st.replaceAll("\\s+",""); //удаляем все пробелы и невидимые символы
 * // // (например, tab, \n)
 * // System.out.println(st);
 */
