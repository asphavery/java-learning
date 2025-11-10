import java.util.Scanner;

public class Risk
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Player 1? ");
		String p1 = sc.nextLine();
		System.out.print("Player 2? ");
		String p2 = sc.nextLine();

		Dice dice = new Dice();

		int p1r1 = dice.roll();
		int p1r2 = dice.roll();
		int p1r3 = dice.roll();

		int p2r1 = dice.roll();
		int p2r2 = dice.roll();
		int p2r3 = dice.roll();

		String rolls1 = p1r1 + " "+p1r2+" "+p1r3;
		String rolls2 = p2r1+" "+p2r2+" "+p2r3;

		String result = dice.winner(p1,p2,rolls1,rolls2);
		System.out.print(result);

	}
}