/**
 * solution
 */
public class solution {

    public static void main(String[] args) {
        int n = 124;
        int product = 1;
        int sum = 0;
        while (n > 0){
            product *= n%10;
            sum += n%10;
            n/=10;
        }
        System.out.printf("Result= %s", product - sum);
    }
}