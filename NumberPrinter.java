/**
 * @author Arash
 *	This program prints even numbers and stops the comma between them from printing at the end.
 */
public class NumberPrinter 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int MAX = 50;
		while (i <= MAX) 
		{
			/** 
			 * i%2 == 0 for even number
			 * i%2 == 1 for odd number
			 */
			if (i%2 == 0)	
			{
				System.out.print(i);
				
				int comma = MAX - 1;
				if(i < comma)
				{
					System.out.print(",");
				}				
			}	
			
			i++;
		}
	}
}
