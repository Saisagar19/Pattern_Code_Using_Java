package pattern;

public class Pattern_8 {
	public static void main(String[] args) {


		for(int row=1;row<=5;row++)
		{

			for(int col=1;col<=10;col++)
			{
				if(col%2!=0)
				{
					System.out.print(" "+col);
				}	
			}

			System.out.println();
		}
	}
}

//Output

//1 3 5 7 9
//1 3 5 7 9
//1 3 5 7 9
//1 3 5 7 9
//1 3 5 7 9