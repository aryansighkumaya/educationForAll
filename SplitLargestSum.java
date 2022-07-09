public class SplitLargestSum {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int m=2;
   int sum= Split(arr,m);
   System.out.println(sum);
  }
  static int Split(int [] arr,int m){
    int start=Integer.MIN_VALUE;
    int end=0;
    for (int index = 0; index < arr.length; index++) {
      start=Math.max(start,arr[index]);
     end=end+arr[index];

    }
    if (m==arr.length) {
      return start;
    }
     
     
    
    while (start<end) {
      int pieces=1;
      int sum=0;
      int mid=start+(end-start)/2;
      for (int index = 0; index <= arr.length-1; index++) {
        sum=sum+arr[index];
        if (sum>mid) {
          pieces++;
          sum=arr[index];
          
          
        }
      }
      if (pieces>m) {
        start=mid+1;
      }
      else end=mid;



    }
    return start;
    




  }
}
