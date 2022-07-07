import java.util.Scanner;
public class ArmsStrongNumber {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    // int n=input.nextInt();
    for (int index = 100; index < 1000; index++) {
      boolean ans= ArmsStrong(index);
      if(ans){
        System.out.println(index);
      }
    }
  
  
  }
  static boolean ArmsStrong(int n){
    int temp=n;
int sum=0;
while(n>0){
int rem=n%10;

sum=sum+(rem*rem*rem);
n=n/10;

}

return (sum==temp);

  }
}
