class Satyam
{
	public static void main(String args[])
	{
		Son obj=new Son();
		obj.disp();
	}
}
class Father 	//Super Class
{
	int a;	//Instance Variable
}
class Son extends Father	//Sub Class
{
	int a;	//Instance Variable
	void disp()	//Method
	{
		a=100;
		super.a=200;
		System.out.println("Value Of A="+a);
		System.out.println("Value Of A="+super.a);
	}
}