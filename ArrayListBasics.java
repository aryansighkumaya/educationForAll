import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListBasics {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<Integer>();
    for (int index = 0; index < 5; index++) {
      list.add(input.nextInt());
    }
    for (int index = 0; index < list.size(); index++) {
      System.out.print(list.get(index) + " ");
    }
  
  

  }
}
