package pattern;

import java.util.Iterator;

public class S {

	public static void main(String[] args) {


		for (int row = 1; row < 6; row++) 
		{
			for (int col = 1; col < 5; col++) 
			{
				if(row==1 && col==3 | col==4)
				{
					System.out.print("S");
				}
				else 
				{
					System.out.print(" ");
				}
			}
		}
	}
}
