import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionArray {
  public static void main(String[] args) {
    int[][] arr=new int[3][2];
    
    Scanner input=new Scanner(System.in);
    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {
        arr[row][column]=input.nextInt();
      }
    }
    for (int row = 0; row < arr.length; row++) {
      // for (int column = 0; column < arr[row].length; column++) {
      //   System.out.print(arr[row][column] + " ");
      // }
      // System.out.println();
      System.out.println(Arrays.toString(arr[row]));
    }
    for (int[] ele : arr) {
     System.out.println(Arrays.toString(ele));
    }
  }
}
