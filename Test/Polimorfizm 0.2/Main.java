import Base.*;

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
