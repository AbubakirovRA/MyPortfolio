import java.util.Scanner;

public class fizzBizz {

  public static void main(String[] args) {
    fizzBizz(getNum());
  }

  public static int getNum() {
    Scanner line = new Scanner(System.in);
    System.out.println("Enter limit ");
    String str = line.nextLine();
    try {
      int num = Integer.parseInt(str);
      line.close();
      return num;
    } catch (Exception e) {
      System.out.println("Entered wrong " + e);
    }
    return 0;
  }

  public static void fizzBizz(int num){
    for (int i = 0; i < num; i++) {
        var output = "";
        if (i%3==0){output +="Fizz";}
        if (i%5==0){output +="Bizz";}
        if (i%3!=0 && i%5!=0){output +=i;}
        System.out.println(output);
    }
  }
}
