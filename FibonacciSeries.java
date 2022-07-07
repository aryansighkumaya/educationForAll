import java.util.Scanner;
public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
   int a=0;
   int b=1;
   int c;  
    for (int index = 0; index < n; index++) {
      System.out.println(a);
      c=a+b;
      a=b;
      b=c;
      
    }
  }
}
