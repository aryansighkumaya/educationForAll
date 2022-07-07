import java.util.Arrays;

public class varArgs {
  public static void main(String[] args) {

    multiple(1,2,3,4,5,6,7,8); //v should be in the end
  }
  static void multiple(int a,int ...v){

System.out.println(a);
System.out.println(Arrays.toString(v));

  }
}
