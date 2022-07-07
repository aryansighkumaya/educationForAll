import java.util.Arrays;

public class FirstandLast {
  public static void main(String[] args) {
    int[] arr={5,7,7,7,7,8,8,10};
    int target=7;
   int[] set=search(arr,target);
   System.out.println(Arrays.toString(set));


  }
 
static int[] search(int[] arr,int target){
  int[] ans={-1,-1};
//for first occurences
 
int start=0;
int end=arr.length-1;
while(start<=end){
int mid=start+(end-start)/2;
if (arr[mid]==target) {
  ans[0]=mid;
  end=mid-1;
}
else if (arr[mid]<target) {
start=mid+1;
}
else {

 end=mid-1;
}
}
//for second occurences
 
start=0;
 end=arr.length-1;
while(start<=end){
int mid=start+(end-start)/2;
if (arr[mid]==target) {
  ans[1]=mid;
  start=mid+1;
}
else if (arr[mid]<target) {
  start=mid+1;
}
else {

 end=mid-1;
}


}





return ans;





}

}