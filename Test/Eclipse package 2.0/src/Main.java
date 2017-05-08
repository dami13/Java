/**
 * Testing java package in Eclipse
 * @author dami
 * @version 1.0
 */

import author.AboutAuthor;
import author.AboutSecondAuthor;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("First Author:");
		AboutAuthor author = new AboutAuthor();
		author.showInfo();
		System.out.println("\nSecond Author:");
		AboutSecondAuthor secondAuthor = new AboutSecondAuthor();
		secondAuthor.showInfo();
	}
}