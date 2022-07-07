public class Ceiling {
  public static void main(String[] args) {
    int [] arr={2,4,4,8,10};
    int target=3;
   int ans= ceiling(arr,target);
   System.out.println(ans);
  }
  static int ceiling(int[] arr,int target){
  if (arr[arr.length-1]<target) {
    return -1;
  }
    
int start=0;
int end=arr.length-1;
while (start<end) {
  int mid=start+(end-start)/2;
  if (arr[mid]==target) { 
    return mid;
  }
  else if (arr[mid]>target) {
    end=mid;
  }
  else start=mid+1;
  
}
return start;




  }

  }