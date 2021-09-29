package myproject;

public class Array2 {
	public static void main(String[] args)
	{
		int[][] k= 
			{
				{1,2,4,5,6,7},
				{643,74,93},
				{45,76,5656,838387}				
			};
		for(int i=0;i<k.length;i++)
		{
			for(int j=0;j<k[i].length;j++)
				{
					System.out.print(k[i][j]+ " ");
								
				}
				System.out.println();							
		}
		System.out.println("2D array:: For each loop:: ");
		for(int i[]:k)
		{
			for(int j:i)
			{
				System.out.print(j + " ");
			}
			System.out.println();
			
		}		


		


	}}
