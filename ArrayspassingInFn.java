import java.util.Arrays;

public class ArrayspassingInFn {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    change(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void change(int[] nums){
nums[0]=99;

  }
}
//This shows mutubaility.It means you can change the object but strings are immutable in java hence they cannot be changed.
