class Geekyshows
{
	public static void main(String args[])
	{
		Son obj=new Son();
	}
}
class Father	//Super Class
{
	Father()	//Default Constructor
	{
		int a=100;
		System.out.println("Super Class Constructor a="+a);
	}
}
class Son extends Father	//Suub Class 
{
	Son()	//Default Constructor
	{
						//Or	super();
		int b=200;
		System.out.println("Sub Class Constructor b="+b);
	}
}