public class SmallestLetterGreater {
  public static void main(String[] args) {
    char[] arr={'c','f','j'};
    char target='j';
  char ch=  Smallest(arr,target);
  System.out.println(ch);
 
  }
   static char Smallest(char[] arr,char target){
   if (target>=arr[arr.length-1]) {
    return arr[0];
   }

int start=0;
int end=arr.length-1;
while (start<end) {
  
int mid=start+(end-start)/2;

if (arr[mid]>target) {
  end=mid;
} 
else start=mid+1;


}
return arr[start % (arr.length)];


  }

}
