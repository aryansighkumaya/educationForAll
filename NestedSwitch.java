import java.util.Scanner;
public class NestedSwitch {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  int empID=input.nextInt();
  String Department=input.next();
  switch(empID){
case 1:
System.out.println("Employee 1");
break;
case 2:
System.out.println("Employee 2");
break;
case 3:
System.out.println("Employee 3");
switch(Department){
case "IT":
System.out.println("IT Department");
break;
case "Management":
System.out.println("Management Department");
break;
default:
System.out.println("No department");

}
break;
default:
System.out.println("Enter valid employee id");


  }
}
}
