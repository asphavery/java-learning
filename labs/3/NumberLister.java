import java.util.Scanner;

public class NumberLister
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("***Printing Numbers from 1 to n ***");
    System.out.print("N?: ");
    int n = in.nextInt();

    if (n<=0)
      System.out.println("Input not allowed");
      return;

    int i = 1;
    String s = "";
    while (i < n+1)
    {
      s = s + " " + 1
      i++;
    }

  }
}
