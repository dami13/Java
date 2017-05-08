import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int sizeOfArray;
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj rozmiar tablicy(int):");
		
		sizeOfArray = input.nextInt();
		
		int[] randomArray = new int[sizeOfArray];//just a random Array ;)
		
		for(int i=0; i<sizeOfArray; i++)
			randomArray[i] = i%3;
			
		for(int i : randomArray)
			System.out.println("Element: " + i);
	}
}
