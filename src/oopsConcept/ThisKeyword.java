package oopsConcept;

public class ThisKeyword {
	
	int x;int y;
	
	public void add(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void add()
	{
		System.out.println(x+y);
	}
	
	public static void main(String args[])
	{
		ThisKeyword tk= new ThisKeyword();
		tk.x=2;
		tk.y=89;
		//tk.add(3,4);
		tk.add();
	}
	
}
