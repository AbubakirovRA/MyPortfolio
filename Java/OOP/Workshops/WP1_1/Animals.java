package OOP.Workshops.WP1_1;

public class Animals {
    protected String type;
    protected String breed;

    public Animals(String type, String breed){
        this.type = type;
        this.breed = breed;
    }

    public Animals(){
        this("Просто животное", "Беспородное");
    }

    private String getInfo(){
        return String.format("Вид: %s, порода: %s", type, breed);
    }

    /**
     * Переопределяем метод toString, функционалом из getInfo
     */
    @Override
    public String toString() {
        return getInfo();
    } 
}