public class PeakElementInMountainArray {
 public static void main(String[] args) {
  int [] arr={1,2,3,4,5,10,8,7};
  int ans=search(arr);
  System.out.println(ans);
 }
 static int search(int [] arr){
int start=0;
int end=arr.length-1;
while(end>start){
int mid=start+(end-start)/2;
if (arr[mid]<arr[mid+1]) {
  start=mid+1;
}
else end=mid;


}
return start;



 }
  
}
