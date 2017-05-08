import java.util.Scanner;

public class For
{
	public static void main(String[] args)
	{
		int i;
		Scanner output = new Scanner(System.in);
		System.out.println("Podaj liczbę(Całkowita, dodatnia)");
		i = output.nextInt();
		System.out.println();
		if(i<0)
		{
			System.out.println("Coś poszło nie tak..(i<0?)");
			System.exit(-1);
		}
		output.close();
		for(int j = 0; j != i; i--)
			System.out.println(i);
		System.out.println("BOOM!!!");
		
	}
}
