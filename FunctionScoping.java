public class FunctionScoping {
  public static void main(String[] args) {
    int a=20;
    int b=10;
    swap(a,b);
    System.out.println(num1,num2);
  }
  static int swap(int a,int b){
    int temp=num2;
    int num2=num1;
    num1=temp;


  }
}
//num1 and num2 will only be used in swap function and will not be used in other functions 