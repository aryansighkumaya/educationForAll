import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionArrayR {
  public static void main(String[] args) {
    int[][] arr=new int[5][3];
    Scanner input=new Scanner(System.in);
    for (int index = 0; index < arr.length; index++) {
      for (int i = 0; i <arr[index].length ; i++) {
        arr[index][i]=input.nextInt();
      }
    }
   
  //  for (int index = 0; index < arr.length; index++) {
  //   System.out.println(Arrays.toString(arr[index]));
  //  }
  for (int[] ele : arr) {
    System.out.println(Arrays.toString(ele));
  }
  }
}
