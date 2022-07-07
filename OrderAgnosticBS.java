public class OrderAgnosticBS {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int target=10;
   int ans= binarysearch(arr,target);
   System.out.println(ans);
  }
  static int binarysearch(int[] arr,int target){
int start=0;
int end=arr.length-1;
while (start<=end) {
  int mid=start+(end-start)/2;
  if (asc(arr)){
if (arr[mid]>target) 
  end=mid-1;
else if(arr[mid]<target) 
start=mid+1;
else return mid;
  }
else{

  if (arr[mid]>target) {
    start=mid+1;
  }
  else if (arr[mid]<target) {
    end=mid-1;
  }
  else return mid;
}
  


}
 return -1;


  }
  static boolean asc(int[] arr){

    if (arr[0]<arr[arr.length-1]) {
      return true;
    }
    return false;
  }

}
