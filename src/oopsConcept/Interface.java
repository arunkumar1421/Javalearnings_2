package oopsConcept;


interface FB
{
	void login();
	void sendMessage();
}

class OpenFB implements FB
{
	void login(String click)
	{
		System.out.println("clicking on  faceBook");
	}
	public void login()
	{
		System.out.println("Opening faceBook");
	}
	
	public void sendMessage()
	{
		System.out.println("Sending message..");
	}
}
public class Interface {

	public static void main(String[] args) {
		FB fb= new OpenFB();
		fb.login();
		fb.sendMessage();
		
		

	}

}
