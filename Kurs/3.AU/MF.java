import static java.lang.Math.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class MF
{
	public static void main(String[] args)
	{
		double dNumber0 = 13.13, dNumber1 = 3.33;
		BigInteger bInteger0 = new BigInteger("2342343222");
		BigDecimal bDecimal0 = new BigDecimal("3.14151212122131231232");
		BigInteger bInteger1 = BigInteger.valueOf(1519923);
		BigInteger bSum0 = bInteger0.add(bInteger1);
		
		System.out.println("Liczba0: " + dNumber0);
		System.out.println("Liczba1: " + dNumber1);
		System.out.println("sqrt(liczba0): " + Math.sqrt(dNumber0));
		System.out.println("sqrt(liczba1): " + sqrt(dNumber1));
		System.out.println("pow(liczba0, liczba1): " + Math.pow(dNumber0, dNumber1));
		System.out.println("PI: " + PI);
		System.out.println("E: " + E);
		System.out.println("BigInteger0: " + bInteger0.toString());
		System.out.println("BigInteger1: " + bInteger1);
		System.out.println("BigDecimal: " + bDecimal0);
		System.out.println("bSum: " + bSum0.toString());
		System.out.println("bMod: " + bInteger0.mod(bInteger1));
		System.out.println("bMultiply: " + bInteger0.multiply(bInteger1));
	}
}
