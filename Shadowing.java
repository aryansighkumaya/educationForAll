public class Shadowing {
  static int x=40;
  public static void main(String[] args) {
    int x=40; //It will shadow the above one
    System.out.println(x); 
    
    example();
  }
  static void example(){
System.out.println(x);

  }
  
}
