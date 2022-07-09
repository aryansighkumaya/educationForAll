public class RBSDupliacates {
  public static void main(String[] args) {
    int[] arr = {4,5,6,8,1,2};
    int target=2;
    int pivot=pivotWithDuplicates(arr);

   int ans= Cases(arr,target,pivot);
  
   if (ans==-1) {
    System.out.println(false);
   }
   else System.out.println(true);
  }
  static int pivotWithDuplicates(int[] arr){
int start=0;
int end=arr.length-1;
while(end>=start){
int mid=start+(end-start)/2;
if (mid>start && arr[mid]<arr[mid-1]) {
  return mid-1;
}
if (mid<end && arr[mid+1]<arr[mid]) {
  return mid;
}
if (arr[mid]==arr[start] && arr[mid]==arr[end]) {
  if (start<arr.length-1 && arr[start]>arr[start+1]) {
    return start;
  }
  start++;
  end--;

}
else if (arr[start]<arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end]) {
  start=mid+1;
}
else end=mid-1;




}
return -1;



  }
  static int Cases(int[] arr,int target,int pivot){
    if(arr[pivot]==target){
      return pivot;
    }
if (pivot==-1) {
  return binarySearch(arr,0,arr.length-1,target);
}
if (arr[0]<=target) {
  return binarySearch(arr,0,pivot-1,target); //can be found till pivot-1 cuz it's already greater than the start elemet and after pivot the numbers will obviousoly smaller than target then there makes no sense to search over there
}
return binarySearch(arr,pivot+1,arr.length-1,target);




  }
  static int binarySearch(int[] arr,int start,int end,int target){
while(end>=start){
  int mid=start+(end-start)/2;
  if (arr[mid]==target) {
    return mid;
  }
  else if (arr[mid]>target) {
    end=mid-1;
  }
  else start=mid+1;

}
return -1;




  }
}
    
