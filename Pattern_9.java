package pattern;

public class Pattern_9 {
	public static void main(String[] args) {


		for(int row=1;row<=5;row++)
		{

			for(int col=0;col<=10;col++)
			{
				if(col%2==0)
				{
					System.out.print(" "+col);
				}	
			}

			System.out.println();
		}
	}
}

//Output

//0 2 4 6 8 10
//0 2 4 6 8 10
//0 2 4 6 8 10
//0 2 4 6 8 10
//0 2 4 6 8 10