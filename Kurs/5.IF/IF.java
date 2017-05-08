import java.util.Scanner;

public class IF
{
	public static void main(String[] args)
	{
		int number0, number1, option;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wybierz opcje(int)");
		System.out.println("1.Test parzystości(int)");
		System.out.println("2.Porównanie 2 liczb(int)");
		System.out.println("3.Wyjście");
		option = input.nextInt();
		
		switch(option)
		{
			case 1:
				System.out.println("Test parzystości");
				System.out.println("Podaj liczbe(int && <10)");
				number0 = input.nextInt();
		
				if(number0 < 10)
				{
					if(number0 % 2 == 0)
					{
						System.out.println("Podana liczba jest parzysta");
					}
					else
						System.out.println("Podana liczna nie jest parzysta");
				}
				else
					System.out.println("Liczba większa od 10");
				break;
			
			case 2:
				System.out.println("Podaj pierwszą liczbe(int)");
				number0 = input.nextInt();
				
				System.out.println("Podaj drugą liczbe(int)");
				number1 = input.nextInt();
				
				if(number0 < number1)
				{
					System.out.println("Pierwsza liczba jest mniejsza");
				}
				else
				{
					if(number0 > number1)
					{
						System.out.println("Pierwsza liczba jest większa");
					}
					else
						System.out.println("Liczby są równe");
				}
				break;
			case 3:		
				System.exit(0);
				break;
			default:
				System.out.println("Podano błędny parametr");	
		}
	}	
}
