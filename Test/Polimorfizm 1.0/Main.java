import Help.ExtInfo;

public class Main
{
	public static void main(String args[])
	{
		System.out.println("How/More from class: \"Help\"");
		Help x = new Help();
		x.how();
		x.more();
		System.out.println("How/More from class: \"ExHelp\"");
		x = new ExHelp();
		x.how();
		x.more();
		System.out.println("Using \"super\" ");
		ExHelp y = new ExHelp();
		y.superHow();
		y.superMore();
	}
}

