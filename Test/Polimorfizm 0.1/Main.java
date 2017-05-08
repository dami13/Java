class BaseENG
{
	public void ShowBaseMSG()
	{
		System.out.println("All your bases now belong to us.");
	}
}

class BaseBrokenENG extends BaseENG
{
	public void ShowBaseMSG()
	{
		System.out.println("All your base are belong to us.");
	}	
}

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("In English:");
		BaseENG eng = new BaseENG();
		eng.ShowBaseMSG();
		System.out.println("In Engrish:");
		eng = new BaseBrokenENG();
		eng.ShowBaseMSG();
	}
}
