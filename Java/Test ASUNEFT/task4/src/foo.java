package task4.src;


public class foo {
    public static int numDigits(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count +=1;
        }
        return count;
    }
}
