import java.util.Scanner;

public class MultipleLister {
  public static void main(String[] args) {

    //read in integers
    Scanner in = new Scanner(System.in);
    System.out.print("Enter positive integer, n and m: ");
    int n = in.nextInt();
    //System.out.print("m");
    int m = in.nextInt();

    //compute multiples
    int multiple = n;
    String result = "";
    while (multiple < m - n) {
      multiple = multiple + n;
      result = result + " " + multiple;
    }


    //standard output
    System.out.println("Multiples of "+n+" between "+n+" and "+m+": "
      + result);
  }
}
