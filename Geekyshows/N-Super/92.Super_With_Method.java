class Geekyshows
{
	public static void main(String args[])
	{
		Son obj=new Son();
		obj.disp();
	}
}
class Father	//Super Class
{
	int a=100;	//Instance Variable
	void put()	//Super Class Method
	{
		System.out.println("Super Class a="+a);
	}
}
class Son extends Father	//Sub Class
{
	int b=200;	//Instance Variable 
	void put()	//Sub Class Method 
	{
		System.out.println("Sub Class b="+b);
	}
	void disp()	//Method
	{
		put();	//Or	super.put();
	}
}