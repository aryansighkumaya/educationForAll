public class LinearsearhinStrings {
//   public static void main(String[] args) {
//     String[] name={"kunal","Rahul","Adarsh","Panku"};
//     String s="kamal";
//     boolean ans=search(s,name);
//     System.out.println(ans);
//   }
//   static boolean search(String s,String[] name){
// for (int index = 0; index < name.length; index++) {
//   if (s==name[index]) {
//     return true;
//   }
// }
// return false;

//   }
public static void main(String[] args) {
  String s="Aryan";
  char ch='w';
  boolean ans=search(s,ch);
  System.out.println(ans);
}
static boolean search(String s,char ch){
  if (s.length()==0) {
    return false;
  }

// for (int index = 0; index < s.length(); index++) {
//   if (s.charAt(index)==ch) {
//     return true;
//   }
// }
// char[] c=s.toCharArray();
for(int ele : s.toCharArray()) {
  if (ele==ch) {
    return true;
  }
}

return false;
}
}
