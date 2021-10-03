class Geekyshows
{	public static void main(String args[])
	{
	Son obj=new Son();
	}
}
class Father	//Super Class
{
	Father(int x)	//Parameterized Constructor
	{
		int a=x;
		System.out.println("Super Constructor a="+a);
	}
}
class Son extends Father	//Sub	class
{
	Son()
	{
		super(100);
		int b=200;
		System.out.println("Sub Class Constructor b="+b);
	}
}