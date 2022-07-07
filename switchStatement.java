import java.util.Scanner;
public class switchStatement {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String fruit=input.next();
    
    switch(fruit) {
      case "Apple":
        System.out.println("Apple is red");
        break;
        case "Mango":
        System.out.println("Mango is the king of the fruit");
    break;
    case "banana":
    System.out.println("Mango is good for health");
    break;
      default:
      System.out.println("Please Enter a valid fruit");
        
    }
  }
}
