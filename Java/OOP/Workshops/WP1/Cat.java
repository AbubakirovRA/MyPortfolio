package OOP.Workshops.WP1;

public class Cat extends Pets{
    public Cat(String name){
        super(name);
    }

    public Cat(){
        this("Просто кот");
    }

    /*
     * метод, моделирующий реакцию кота
     * на зов
     * @param Sound
     */
    public void hearCall(String Sound){
        if (Sound.contains(this.name)){
            accept();
        } else {
            reject();
        }
    }

    /*
     * Реакция кота на зов по имени
     */

     public void accept(){
        System.out.printf("%s сказал 'Мяу!'", this.name);
     }

     /*
      * Игнор, если имя не услышано
      */

      public void reject(){
        System.out.printf("%s дернул кончиком хвоста.", this.name);
     }

     public String getName(){
        return this.name;
     }

}
