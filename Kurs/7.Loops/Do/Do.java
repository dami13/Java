import java.util.Scanner;

public class Do
{
	public static void main(String[] args)
	{
		int i;
		String text;
		Scanner output = new Scanner(System.in);
		
		System.out.println("Podaj liczbę(całkowitą, dodatnią):");
		i = output.nextInt();
		output.nextLine();//czyszcze buffor
		if(i < 1)
		{
			System.out.println("Błąd, i<1");
			System.exit(-1);
		}	
		System.out.println("Podaj tekst do wypisania");
		text = output.nextLine();
		output.close();
	
		
		do
			System.out.println(text);
		while(--i > 1);
	}
}
