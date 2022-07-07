public class BinarySearch {
public static void main(String[] args) {
  int[] arr={2,10,11,13,4,19,20};
  int target=20;
 int ans= binarysearch(arr,target);
 System.out.println(ans);
}
static int binarysearch(int[] arr,int target){
int start=0;
int end=arr.length-1;

while(start<=end){
  int mid=start+(end-start)/2;
  if (arr[mid]>target) {
    end=mid-1;
  }
  else if (arr[mid]<target) {
    start=mid+1;
  }
  else return mid;



}
return -1;


}
}
