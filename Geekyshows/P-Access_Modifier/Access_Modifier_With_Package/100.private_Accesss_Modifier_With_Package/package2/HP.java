package package2;
import package1.*;
public class HP extends Laptop
{
	public int e=40;
	public void disph()
	{
		Laptop obj1=new Laptop();
		System.out.println("HP Class From package2 E="+(e+obj1.displ()));
	}
}
