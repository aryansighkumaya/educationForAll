public class TargetInMountainArray {
public static void main(String[] args) {
  int[] mountainArr={1,2,3,5,8,10,9,0};
  int target=3;
 int peakIndex=peak(mountainArr);
 if(mountainArr[peakIndex]==target)
 System.out.println(mountainArr[peakIndex]);

 int temp=search(0,peakIndex-1,mountainArr,target);
 if (temp==-1) {
  temp=search(peakIndex+1,mountainArr.length-1,mountainArr,target);
 }


 System.out.println(temp);
 


}
static int peak(int [] mountainArr){
  int start=0;
  int end=mountainArr.length-1;
  while(end>start){
  int mid=start+(end-start)/2;
  if (mountainArr[mid]<mountainArr[mid+1]) {
    start=mid+1;
  }
  else end=mid;
  
  
  }
  return start;
  
}
static int search(int start,int end,int[] mountainArr,int target){
  boolean isAsc = mountainArr[start] < mountainArr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (mountainArr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;

  

  


}
}