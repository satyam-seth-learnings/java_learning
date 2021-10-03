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
}
class Son extends Father	//Sub Class 
{
	int a=200;	//Instance Variable
	void disp()	//Method 
	{
		System.out.println("Value Of A="+a);
		System.out.println("Value Of A="+super.a);
	}
}