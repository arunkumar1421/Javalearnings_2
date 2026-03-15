package important;

public class SecondLargestNumber {
	
	public static int secondLargest(int a[])
	{
		int firstlargest= Integer.MIN_VALUE;
		int secondlargest= Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(firstlargest<a[i])
			{
				secondlargest=firstlargest;
				firstlargest=a[i];
			}
			
			else if(secondlargest<a[i] && firstlargest!=a[i])
			{
				secondlargest=a[i];
			}
		}
		
		
		return secondlargest;
	}

	public static void main(String[] args) {
		int a[]= {4,7,6,8,3,10};
		int num=secondLargest(a);
		System.out.println(num);

	}

}
