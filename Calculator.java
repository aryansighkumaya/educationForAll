import java.util.Scanner;
public class Calculator {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int ans=0;
    while (true) {
      
    System.out.println("Enter the operator");
    char ch=input.next().trim().charAt(0);
    
    if (ch=='+' || ch=='-'|| ch=='*' || ch=='/' || ch=='%') {
      System.out.println("Enter two number");
      int num1=input.nextInt();
      int num2=input.nextInt();
      if (ch=='+') {
        ans=num1+num2;
        System.out.println(ans);
      }
      if (ch=='-') {
        ans=num1-num2;
        System.out.println(ans);
      }
      if (ch=='*') {
        ans=num1*num2;
        System.out.println(ans);
      }
      if (ch=='/') {
        ans=num1/num2;
        System.out.println(ans);
      }
      if(ch=='%'){
        ans=num1%num2;
        System.out.println(ans);
      }
      else if (ch=='x' || ch=='X') {
        break;
      }
      else System.out.println("Invalid operator");
      


    }
    }
  }
}
