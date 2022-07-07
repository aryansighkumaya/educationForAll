public class searchInInfiniteArray {
  public static void main(String[] args) {
    int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30,31};
    int target=30;
   int ans= search(arr,target);
   System.out.println(ans);
  }
  static int search(int[] arr,int target){
int start=0;
int end=1;
while (arr[end]<target) {
 int temp=end+1;
 end=end+(end-start+1)*2;
 start=temp;




}
return binarysearch(arr,start,end,target);





}
static int binarysearch(int[] arr,int start,int end,int target){



  while(start<=end){
int mid=start+(end-start)/2;
if (arr[mid]==target) {
  return mid;
}
else if(arr[mid]>target){
  end=mid-1;
}
else start=mid+1;


  }
  return -1;
}








  }

