public class ReverseNum {
  public static void main(String[] args) {
    int n=7895;
    int res=0;
    while(n>0){
int r=n%10;
n=n/10; 


res=res*10+r;




    }
    System.out.println(res);
  }
}
