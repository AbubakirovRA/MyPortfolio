public class Program {
    public static void main(String[] args) {

// Создание котов
        Cat barsik = new Cat("Barsik", 8); //СОЗДАНИЕ КОТА ПРИ ПОМОЩИ КОНСТРУКТОРА
        // barsik.name = "Barsik";
        // barsik.age = 5;
        // Cat.catsCount ++;

        System.out.printf("Создадим кота с именем %s, %d лет. Создано котов %d\n", barsik.name, barsik.age, Cat.catsCount);

        Cat murzik = new Cat("Bob", 4); //СОЗДАНИЕ КОТА ПРИ ПОМОЩИ КОНСТРУКТОРА
        murzik.name = "Murzik"; // при создании конструктора вместо имен экземпляров в 
        murzik.age = 2; // конструкторе используется ключевое слово this
        // Cat.catsCount ++;

        Cat streetCat = new Cat();
        System.out.println("Создан уличный кот: " + streetCat.name);

        System.out.printf("Создадим кота с именем %s, %d лет. Создано котов %d\n", murzik.name, murzik.age, Cat.catsCount + Cat.streetCats);

        barsik.jump();
        murzik.sayMeow();

        Dog sharik = new Dog("Шарик", 1);
        Dog streetDog = new Dog();

        System.out.println("Создано всего псов: " + (Dog.dogCount + Dog.dogStreet));
        System.out.println("Из них домашних: " + Dog.dogCount + " и бродячих: " + Dog.dogStreet);

        streetDog.Wuf();
        sharik.dogTail();
    }
}
