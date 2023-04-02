/*
Область видимости переменных

У переменных существует понятие «область видимости». 
Если переменную объявили внутри некоторого блока фигурных скобок { }, 
то снаружи этого блока переменная будет недоступна.
*/

public class variable_scope {
    public static void main(String[] args) {
        {
            int i = 123;
            System.out.println(i);           
        }     
        System.out.println("i");  // error: cannot find symbol
    }
}
