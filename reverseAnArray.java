import java.util.Arrays;

public class reverseAnArray {
  public static void main(String[] args) {
    int [] arr={1,2,3,4,5};
    int start=0;
    int end=arr.length-1;
   while(start<end){
swap(start,end,arr);
start++;
end--;

   }
   System.out.println(Arrays.toString(arr));
  }
   static void swap(int start,int end,int [] arr){
int temp=arr[start];

arr[start]=arr[end];
arr[end]=temp;

   }
  
}
