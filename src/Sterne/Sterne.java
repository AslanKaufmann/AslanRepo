package Sterne;


public class Sterne
{
	public static void zeichnenQuadrat()
	{
		zeichnenSternzeile(7);
		for (int i = 1; i <= 5; i++)
		{
		zeichnenSternrand(7);
		}
		zeichnenSternzeile(7);
	}

	private static void zeichnenSternzeile(int pL�nge)
	{
		for (int i = 1; i < pL�nge; i++)
	    {
	      System.out.print("*");
	    }
		 System.out.println("*");

		// TODO Auto-generated method stub

	}

	private static void zeichnenSternrand(int pL�nge)
	{
		System.out.print("*");
		for (int i = 1; i < pL�nge-1; i++)
	    {
	      System.out.print(" ");
	    }
		System.out.println("*");
		// TODO Auto-generated method stub

	}

	private static void starwarsiskuhl()
	{

	}


	public static void main(String[] args)
	   {
		zeichnenQuadrat();
	   }
}