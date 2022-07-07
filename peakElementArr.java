public class peakElementArr {
  public static void main(String[] args) {
    int[] arr={1,2,5,0,1,1};
   int ans= peak(arr);
   System.out.println(ans);
  }
  static int peak(int[] arr){
int start=0;
int end=arr.length-1;

while(end>start){
int mid=start+(end-start)/2;





if(arr[mid]<arr[mid+1]){
start=mid+1;

}
else 
end=mid;



  }
  return start;
}
}
