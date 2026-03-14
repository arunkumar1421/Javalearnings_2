package important;

public class MaxMinNumber {

	static int MaxMin(int a[])
	{
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		return max;
	}
	
	static int MinNumber(int a[])
	{
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,2,3,14,5,6,7};
		int max=MaxMin(a);
		System.out.println(max);
		
		int min= MinNumber(a);
		System.out.println(min);
		
		
	}

}
