public class countNums {
  public static void main(String[] args) {
    int n=455352;
    int count=0;
    while (n>0) {
      int r=n%10;
      if (r==5) {
        count++;
      }
      n=n/10;
    }
    System.out.println(count);

  }
}
