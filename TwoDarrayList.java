import java.util.Scanner;
import java.util.ArrayList;
public class TwoDarrayList {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    for (int index = 0; index < 3; index++) {
      list.add(new ArrayList<>()); //Initialisation.Basically adding arraylist in 3 list
    
    }
    Scanner input=new Scanner(System.in);
    for (int index = 0; index <3; index++) {
      for (int i = 0; i < 4; i++) {
        list.get(index).add(input.nextInt()); //get the first list that you have created above and add elements in it 4 times
      }
    }
    System.out.println(list);

  }
}
