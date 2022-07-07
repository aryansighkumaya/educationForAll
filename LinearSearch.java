import java.util.Scanner;
public class LinearSearch {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int[] arr={2,1,9,10,11,7,99};
    int target=input.nextInt();
    int index=search(arr,target);
    System.out.println(index);
  }
  static int search(int[] arr,int target){

for (int index = 0; index < arr.length; index++) {
  if(arr[index]==target){
    return index;
  }
  
}
return -1;

  }
}
