import java.util.Scanner;

public class IO
{
	public static void main(String[] args)
	{
		String string0;
		int number0;
		double dNumber0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Podaj Imie");
		string0 = input.nextLine();
		System.out.println("Hello " + string0);
		
		System.out.println("Podaj liczbę(int)");
		number0 = input.nextInt();
		System.out.println("Int: " + number0);
		
		System.out.println("Podaj liczbę(dobule)");
		dNumber0 = input.nextDouble();
		System.out.println("Double: " + dNumber0);
	}
}
