public class countevendidgitsInarray {
  public static void main(String[] args) {
    int[] arr={12,17,19,433};
   int ans= find(arr);
    System.out.println(ans);
  }
  static int find(int[] arr){
    int count=0;
for (int index = 0; index < arr.length; index++) {
  if (even(arr[index])) {
    count++;
  }

}
return count;



  }
  static boolean even(int num){
int count=(int)Math.log10(num) +1;

if (count%2==0) {
  return true;
}
return false;
  }
}
