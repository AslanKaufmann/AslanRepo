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

	private static void zeichnenSternzeile(int pLänge)
	{
		for (int i = 1; i < pLänge; i++)
	    {
	      System.out.print("*");
	    }
		 System.out.println("*");

		// TODO Auto-generated method stub

	}
	 //Kommentar von Serdar
	private static void zeichnenSternrand(int pLänge)
	{
		System.out.print("*");
		for (int i = 1; i < pLänge-1; i++)
	    {
	      System.out.print(" ");
	    }
		System.out.println("*");
		// TODO Auto-generated method stub

	}


	public static void main(String[] args)
	   {
		zeichnenQuadrat();
	   }
}