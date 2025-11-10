import java.util.Scanner;

public class MyStatistics
{
  public static void main(String[] args)
  {
    //define array
    final int CAPACITY = 100; //length of partially filled array
    int[] v = new int[CAPACITY];
    int vSize = 0;            //counter of elements in pf array

    //read int from standard input
    Scanner in = new Scanner(System.in);
    System.out.print("Enter: ");
    //loop to read and store data
    while (in.hasNextInt()) //run as long as there is an int from input
    {
      int n = in.nextInt(); //read next integer
      //dynamic resize
      if (vSize >= v.length) //condition if array is full
      {
        int[] newV = new int[2 * v.length]; //define array twice the length
        System.arraycopy(v, 0, newV, 0, v.length);   //copy elements from old to new
        v = newV;       //abandon old array 
      }
      v[vSize] = n;         // save next integer into pf array
      vSize++;              //increment element counter
      // v[vSize++] = in.nextInt();
    }
    in.close();

    //compute mean
    int sum = 0;
    for (int i = 0; i < vSize; i++)
    {
      sum = sum + v[i];
    }
    double mean = ((double)sum) / vSize;

    //compute standard deviation
    double sum2 = 0;
    for (int i = 0; i < vSize; i++)
    {
      sum2 = sum2 + (v[i] - mean) * (v[i] - mean);
    }
    double sigma2 = sum2 / vSize;
    double sigma = Math.sqrt(sigma2);

    //print results to standard output
    System.out.println("mean = " + mean+ " sigma = "+sigma);

  }
}
