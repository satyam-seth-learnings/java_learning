package package2;
import package1.*;
public class Computer 
{
	public int c=50;
	public void dispc()
	{
		Laptop obj6=new Laptop();
		obj6.displ();
		System.out.println("Computer Class From package2 C="+c);
	}
}
