public class twoDarrayMinNo {
public static void main(String[] args) {
  int[][] arr={{10,20},{80,100},{-1,19}};
 int ans= max(arr);
 System.out.println(ans);

}
static int max(int[][] arr){

int Max=Integer.MIN_VALUE;
for (int[] ele : arr) {
  for (int num : ele ) {
    if (num>Max) {
      Max=num;
    }
  }
}
return Max;

}

}
