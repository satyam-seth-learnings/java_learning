package package2;
import package1.Laptop;
public class Computer 
{
	public int d=20;
	public void dispc()
	{
		Laptop obj2=new Laptop();
		System.out.println("Computer Class From package2 D="+(d+obj2.b));
	}
}
