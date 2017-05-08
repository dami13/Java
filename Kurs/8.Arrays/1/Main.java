

import java.util.Scanner;

public class Main{
	static int SizeOfArray = 5;
	
	public static void main(String[] args){
		String[] arrayOfNames = new String[5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Podaj 5 imion");
		for(int i=0; i<SizeOfArray; i++){//pobranie danych
			arrayOfNames[i] = input.nextLine();
		}
		
		for(String x : arrayOfNames){
			System.out.println("Witaj: " + x);
		}
	}
}
