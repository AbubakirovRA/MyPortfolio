/**
 * task1
 * вычисление арифметического выражения в постфиксной записи
 */
import java.util.Set;
import java.util.Stack;

public class postFix {

    public static void main(String[] args) {
        String str = "3 2 - 5 8 * 2 / 9 + *";
        String[] strArr = str.split(" ");
        System.out.println(evalRPN(strArr));
    }

    public static int evalRPN(String[] tokens) {
        Set<String> operations = Set.of("+", "-", "*", "/");
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!operations.contains(tokens[i])) {
                numbers.push(Integer.parseInt(tokens[i]));
            } else {
                int num2 = numbers.pop();
                int num1 = numbers.pop();
                switch (tokens[i]) {
                    case "+":
                        numbers.push(num1 + num2);
                        break;

                    case "-":
                        numbers.push(num1 - num2);
                        break;

                    case "*":

                        numbers.push(num1 * num2);
                        break;

                    case "/":
                        numbers.push(num1 / num2);
                        break;
                }

            }
        }
        return numbers.pop();
    }
}
