package WP3;
/*Создайте класс Счетчик, у которого есть метод add(), 
увеличивающий значение внутренней int переменной на 1.  
Сделайте так, чтобы с объектом такого типа можно было работать 
в блоке try-with-resources и после выхода из блока, он не давал 
больше возможности выполнять метод add(), 
а при попытке это сделать бросал бы исключение. 
Подумайте над типом исключения.
*/

public class task2 {
    public static void main(String[] args) {
        Counter i = new Counter()
        try (i){
            i.add();
            i.add();
            i.add();
            i.add();
            i.add();
            i.add();
            i.add();
            i.add();
        }
        i.add();
        System.out.println(i.getIndex());
    }

    public class Counter implements AutoCloseable{
        private int index = 0;
        private boolean open = true;

    public  void add(){
        if (open) {
            index++;
        } else {
            throw new RuntimeException("Not");
        }
    }

        @Override
            public void close(){
                this.open = false;
            }
    
    }

}
