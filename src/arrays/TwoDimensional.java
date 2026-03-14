package arrays;

public class TwoDimensional {
	
	public static void main (String args[])
	{
		int a[][]= new int [2][2];
		
		 a[0][0]= 1;
		 a[0][1]= 2;
		 a[1][0]= 3;
		 a[1][1]= 4;
		 
		 System.out.println(a[1][1]);
		 
		 System.out.println (a.length);
		 
	for(int  i=0;i<a.length-1; i++)
	{
		for (int j=0;j<a[i].length-1; i++)
		{
			System.out.println(a[i][j]);
		}
		System.out.println(" ");
			
	}
		 
	/*
	 * for ( int x []: a) { for (int b:x) { System.out.println(b); } }
	 */
	}

}
