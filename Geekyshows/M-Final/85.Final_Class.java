class Geekyshows 
{
	public static void main(String args[])
	{
		Father f=new Father();
		Son s=new Son();
		f.disp();	//Calling Method Of Super Class
		s.add();	//Calling Method Of Sub Class
	}
}
class Father	//Super Class	//Or final class Father		//(Error)
{
	int a=100;
	void disp()	//Method
	{
		System.out.println("Super Class Father\n");
	}
}
class Son extends Father	//Sub Class Son
{
	int b=200;
	void add()	//Method
	{
		int sum=a+b;
		System.out.println("Sum="+sum);
	}
}		