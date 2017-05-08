package ONT;

import java.io.IOException;
import java.util.Random;

public class ONT
{
	static int tab[] = new int[10];	
	
	public static void generate(int rozmiar, int zakres) throws ArrayIndexOutOfBoundsException
	{
		try
		{
			Random generator = new Random();
			if(rozmiar > 10)
				throw new IOException("Poza zakresem tablicy");
			
			for(int i = 0; i < rozmiar; i++)
			{
				//generowania int z przedziału 1..zakres	
				tab[i] = generator.nextInt();
				if(tab[i] < 0)
					tab[i] *= -1;
				tab[i] %= zakres; i++;
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Caught IOException " + e.getMessage());
		}
	}

	public static int getElementById(int index)
	{
		return tab[index];
	}
}
