import java.util.Scanner;

public class Typecasting {
  public static void main(String[] args) {
    //typecasting
  Scanner input=new Scanner(System.in);
  // int num=(int)input.nextFloat();
  // System.out.println(num);
  //automatic type promotion in expressions
  // int a=257;
  // byte b=(byte)a; //257%256
  // System.out.println(b);
//  byte a=40;
//  byte b=50;
//  byte c=100;
// int d=(a*b)/c;
// System.out.println(d);
// byte b=20;
// b=b*10;
// int num='A';
// System.out.println(num); 
byte b=20;
float f=23.3f;
double d=98.2888;
short s=1024;
char c='A';
int i=24;
double result=(f*b)+(i/c)-(d*s);
//float+int-double=double
System.out.println(f*b + " " + i/c + " " + d*s);
System.out.println(result);

  


  }
}
