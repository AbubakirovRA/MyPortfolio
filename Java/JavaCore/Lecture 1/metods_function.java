/*
Функции и методы
Функции и методы — это технически одно и то же. Функции могут 
не принадлежать классам, а методы принадлежат. 
В java все функции являются методами. 

Описание
Вызов
Возвращаемое значение
Рекурсия

 */
public class metods_function {

    //ФУНКЦИИ (в JAVA все функции являются методами)
    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a, int b) {
        return a+b;
    } 
     
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }

    //МЕТОД MAIN
    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }
}
