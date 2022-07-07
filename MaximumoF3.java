import java.util.Scanner;
public class MaximumoF3 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b =input.nextInt();
    int c=input.nextInt();
    // int max=a;
    // if (b>a) {
    //   max=b;
    // }
    // if (c>b) {
    //   max=c;
    // }
    int max=Math.max(c,Math.max(a,b));
    System.out.println("The maximum is " + max);
  }
}
