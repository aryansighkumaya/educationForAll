import java.util.Arrays;

public class FnOverloading {
  public static void main(String[] args) {
    //  fun("kunal","Rahul","Aryan","Sunn");
    fun(1,2,3,4,5,6);
  }
  static  void fun (String ...v){
    System.out.println(Arrays.toString(v));
  }
  static void fun(int ...v){
System.out.println(Arrays.toString(v));

  }
}
