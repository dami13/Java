import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class IO
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int option;
		String string0;
		File file = new File("dane.txt");
		Scanner output = new Scanner(System.in);
		Scanner outputf = new Scanner(file);
		
		System.out.println("Wybierz opcje(int)");
		System.out.println("1.Zapisz dane");
		System.out.println("2.Odczyt danych");
		System.out.println("3.Exit");
		option = output.nextInt();
		
		switch(option)
		{
		case 1:
			PrintWriter input = new PrintWriter("dane.txt");
			System.out.println("Podaj dane do zapisania");
			output.nextLine();//clearing buffer
			string0 = output.nextLine();
		
			input.println(string0);
			input.close();
			break;
		case 2:
			string0 = outputf.nextLine();	
			System.out.println(string0);
			break;
		case 3:
			System.exit(0);
			break;
		default:	
			System.out.println("Podany zły parametr");
		}
	}
}
