import java.util.Scanner;

public class basicsofconditional {
  public static void main(String[] args) {
    // int salary=25000;
    // if (salary>10000) {
    //   salary+=2000;
    // }
    // //multiple if else 
    // else if (salary>20000) {
    //   salary+=3000;
    // }
    // else salary+=1000;
    // System.out.println(salary);
    Scanner input=new Scanner(System.in);
    char ch=input.next().charAt(0);
    if (ch>='a' && ch<='z') {
      System.out.println("Lowercase");
    }
    else
    System.out.println("uppercase");
  }
  
}
