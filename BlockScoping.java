public class BlockScoping {
  public static void main(String[] args) {
    int a=2;
    {

      // int a=30;  //cannot be initialised again coz it's already been initialised above 
      a=30; //can be modified
     
      int b=90; // cannot be used in another block i.e if only will be modified in another block then b will not be recognised
      System.out.println(b);
    }
    // b=2; // cannot be modified coz b is initialised in another block
  //  System.out.println(b); // cannot even be printed coz block elements will only be used in block only 
  
  int b=20; // initialised earlier in the block but can also be initialised outside the block
System.out.println(a);
System.out.println(b);
// same thing goes for loops
  }
}
