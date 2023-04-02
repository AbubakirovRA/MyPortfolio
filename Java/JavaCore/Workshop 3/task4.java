/**
 * task4
 * Написать программу, показывающую последовательность действий для игры “Ханойская башня”
 */
public class task4 {

    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }

    private static void doTowers(int topN, char source, char destination, char buffer) {
        if (topN == 1){
            System.out.println("Disk 1 from " + source + " to " + destination);
            return;
        }

        doTowers(topN-1, source, buffer, destination);
        System.out.printf("Disk %s from %s to %s ", topN, source, destination);
        System.out.println();
        doTowers(topN - 1, buffer, destination, source);
        }
}
