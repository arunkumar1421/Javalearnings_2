package arrays;

public class MissingNumber {
	
	public static void main(String args[])
	{
		int a[]= {1,2,4,5,6};
		int sum=0,sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		for(int i=1;i<=6;i++)
		{
			sum1=sum1+i;
		}
		System.out.println("Missing number is " + (sum1-sum));
	}

}
