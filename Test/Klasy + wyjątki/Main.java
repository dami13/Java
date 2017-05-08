import ONT.*;

public class Main
{		
	public static void main(String args[])
	{
		ONT objekt = new ONT();
		ONT.generate(11, 10);
		System.out.println(ONT.getElementById(2));
	}
}
