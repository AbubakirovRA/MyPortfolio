public class Artefakt {
    public String name;
    public String age;
    static int number = 212121;

    public Artefakt(){
        number ++;
        this.name = "" + number;        
    }

    public Artefakt(String name){
        number ++;
        this.name = number + ", " + name;
    }

    public Artefakt(String name, String age){
        number ++;
        this.name = number + ", " + name + ", " + age;
    }
}
