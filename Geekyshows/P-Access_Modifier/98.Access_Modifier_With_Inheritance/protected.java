public class Geekyshows 
{
	public static void main(String args[])
	{
		Dell obj=new Dell();
		obj.showprice();
	}
}
class Laptop	//Super Class
{
	protected int a=10;
	protected void show()
	{
		System.out.println("A="+a);
	}
}
class Dell extends Laptop	//Sub Class
{
	public int b=20;
	public int total=a+b;
	public void showprice()
	{
		show();
		System.out.println("B="+b);
		System.out.println("Total="+total);
	}
}