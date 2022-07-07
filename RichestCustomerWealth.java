public class RichestCustomerWealth {
  public static void main(String[] args) {
    int[][] accounts={{1,2,3},{3,2,18},{5,6,7}};
   int max= maxWealth(accounts);
   System.out.println(max);

  }
  static int  maxWealth(int[][] accounts){
    int sum=0;
   int max=Integer.MIN_VALUE;
for (int[] customer : accounts) {
  sum=0;
  for (int wealth : customer) {
    sum=sum+wealth;
  }
    if (sum>max) {
      max=sum;
    }
  
}
return max;

  }
}
