public class Dog {
    public String name;
    public int age;

    static int dogCount = 0;
    static int dogStreet = 0;

    public Dog(String name, int age){
        dogCount ++;
        this.name = name;
        this.age = age;
    }

    public Dog(){
        dogStreet ++;
        this.name = "street dog №" + dogStreet;
    }

    public void Wuf(){
        System.out.println(this.name + " сказал Гав-гав");
    }

    public void dogTail(){
        System.out.println(this.name + " виляет хвостом!");
    }
}
