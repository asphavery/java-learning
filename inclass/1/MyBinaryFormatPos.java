public class MyBinaryFormatPos
{
  public static void main(String[] args)
  {
    //define constant
    final int BASE = 2;

    //define integer
    int decimal = 0;

    //calculate the binary number one by one
    int d1 = decimal % BASE;
    int r1 = decimal / BASE;

    int d2 = r1 % BASE;
    int r2 = r1 / BASE;

    int d3 = r2 % BASE;
    int r3 = r2 / BASE;

    int d4 = r3 % BASE;
    int r4 = r3 / BASE;

    int d5 = r4 % BASE;
    int r5 = r4 / BASE;

    int d6 = r5 % BASE;
    int r6 = r5 / BASE;

    int d7 = r6 % BASE;
    int r7 = r6 / BASE;

    int d8 = 0; //we know that the most significant bit is 0 for positive

    String binary = "0b"+d8+d7+d6+d5+"_"+d4+d3+d2+d1;


    //printing result
    System.out.println(decimal + " in binary: " + binary);

  }
}
