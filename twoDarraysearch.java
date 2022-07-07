import java.util.Arrays;
public class twoDarraysearch {
  public static void main(String[] args) {
    int[][] arr={{1,2},{10,12},{80,40}};
    int target=40 ;
    int[] ans=search(arr,target);
    System.out.println(Arrays.toString(ans));
  }
  static int[] search(int[][] arr,int target){
for (int index = 0; index < arr.length; index++) {
 for (int i = 0; i < arr[index].length ;i++){
  if (arr[index][i]==target) {
return new int[]{index,i};
  }
 }
 
}
return new int[]{-1,-1};
  }
}
