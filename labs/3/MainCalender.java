import java.util.Scanner;

public class MainCalender
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner();
    MyCalender cd = new MyCalender("27/10/2025");

    //String date = sc.nextLine();
    //String date = cd.MyCalender;

    String day = cd.weekDay();

  }
}
