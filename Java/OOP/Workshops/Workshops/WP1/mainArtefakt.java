public class mainArtefakt {
    public static void main(String[] args) {
        
        Artefakt noName = new Artefakt();
        System.out.println("Создан новый артефакт: " + noName.name);

        Artefakt artefakt = new Artefakt("Ацтеки");
        System.out.println("Создан новый артефакт: " + artefakt.name);

        Artefakt artefakt2 = new Artefakt("Инки", "12 век");
        System.out.println("Создан новый артефакт: " + artefakt2.name);
    }
}
