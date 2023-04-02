package OOP.Workshops.WP1_1;

public class Cats extends Animals{
    public String name;
    public String type;
    public String breed;

    public Cats(String name, String type, String breed){
        this.type = type;
        this.breed = breed;
        this.name = name;
    }

    public Cats(){
        this("Кот", "Кошачьи", "Просто кот");
    }
    
    @Override
    public String toString() {
        return String.format("Имя: %s, Вид: %s, Порода: %s", name, type, breed) ;
    } 

}