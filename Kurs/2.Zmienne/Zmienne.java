public class Zmienne
{
	public static void main(String[] args)
	{
		int number0 = 13;
		char znak = 'd';
		double number1 = 2.0, number2 = 3.3;
		String string0 = "wellcome ", string1 = "you", string2 = "!";
		String string3 = string0 + string1 + string2;
		final double PI = 3.1415;
		
		System.out.println(number0);
		System.out.println(znak);
		System.out.println(number0 + znak);
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number1 + number2);
		System.out.println("(string0 + string1): "+(string0+string2));
		System.out.println("PI: " + PI);
		System.out.println(string0.substring(0, 4));
		System.out.println(string3);
	}
}
