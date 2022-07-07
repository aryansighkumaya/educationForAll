public class Floor {
  public static void main(String[] args) {
    int[] arr={2,3,5,9,14,16,18};
    int target=15;
   int ans= floor(arr,target);
   System.out.println(ans);
  }
  static int floor(int[] arr,int target){
int start=0;
int end=arr.length-1;


while (start<end) {
  int mid=start+(end-start)/2+1;
  if (arr[mid]==target) {
    return mid;
  }
  else if (arr[mid]>target) {
    end=mid-1;
  }
  else start=mid;
  
}
return start;






}



  }

