package controlStatements;

public class PrintTable {
	
	public static void main(String args[])
	{
		//int n=4;
		/*
		 * int i=1;
		 * 
		 * while(i<=10) { System.out.println(n+"*"+i+"="+(n*i)); i++; }
		 */
		/*
		 * for (int i=1;i<=10;i++) { System.out.println(n+"*"+i+"="+(n*i)); }
		 */
		
		/*
		 * int i=1;
		 * 
		 * while(i<=10) { System.out.println("Hello"); i++; }
		 */
		
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
				System.out.println(i);
			i++;
		}
	}

}
