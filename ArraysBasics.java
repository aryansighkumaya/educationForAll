import java.util.Arrays;
import java.util.Scanner;
public class ArraysBasics {
  public static void main(String[] args) {
    //Arrays of primitives
    // int[] arr=new int[5];
  Scanner input=new Scanner(System.in);
  // for (int index = 0; index < arr.length; index++) {
  //   arr[index]=input.nextInt();
  // }
  // for (int sunn : arr) {
  //   System.out.print(sunn + " ");
  
  //Arrays of objects
  String[] str=new String[4];
  for (int index = 0; index < str.length; index++) {
    str[index]=input.next();
  }
System.out.println(Arrays.toString(str));
  }
    
  }

