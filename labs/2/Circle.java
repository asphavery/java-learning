import java.util.Scanner;

public class Circle {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Circle radius: ");
    double r = in.nextDouble();

    final double pi = Math.PI;

    double c = 2 * pi * r;

    //printing
    System.out.println("*** The circumference of a circle of radius "+r+" is equal to "+c+" ***");



  }
}
