import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		double[][] d3Array = new double[3][];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tablica Tablic");
		System.out.println("Podaj dlugosc pierwszego elementu tablicy:");
		d3Array[0] = new double[input.nextInt()];
		System.out.println("Podaj dlugosc drugiego elementu tablicy:");
		d3Array[1] = new double[input.nextInt()];
		System.out.println("Podaj dlugosc trzeciego elementu tablicy:");
		d3Array[2] = new double[input.nextInt()];
		
		for(int i=0; i<d3Array.length; i++){
			for(int j=0; j<d3Array[i].length; j++)
				d3Array[i][j] = i*j;
		}
		
		for(int i=0; i<d3Array.length; i++){
			for(int j=0; j<d3Array[i].length; j++)
				System.out.println("Element: " + i + " " + j + " : " + d3Array[i][j]);
		}
	}
}
