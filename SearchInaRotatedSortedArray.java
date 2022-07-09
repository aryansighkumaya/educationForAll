public class SearchInaRotatedSortedArray {
  public static void main(String[] args) {
    int[] arr={3,4,5,6,7,1,2};
 int ans=   findpivot(arr);
 System.out.println(ans);
    }
    static int findpivot(int[] arr){
int start=0;
int end=arr.length-1;
while(start<=end){
int mid=start+(end-start)/2;
if (arr[mid]>arr[mid+1] && mid<end) {
  return mid;
}
if (arr[mid]<arr[mid-1] && mid>0) {
  return mid-1;
}
else if (arr[mid]<arr[0]){
  end=mid-1;
}
else start=mid+1;




}
return -1;



    }
}
