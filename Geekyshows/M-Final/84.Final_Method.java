class Geekyshows
{
	public static void main(String args[])
	{
		Father f=new Father();
		Son s=new Son();
		Daughter d=new Daughter();
		f.call();	//Calling Method Of Super Class
		s.call();	//Calling Method Of Sub Class Son
		d.call();	//Calling Method Of Sub Calling Daughter
	}
}
class Father	//Super Class
{
	int a=100;
	void call()	//Method	//final void call()		(Error)
	{
		System.out.println("Super Class Father\n");
	}
}
class Son extends Father	//Sub Class Son
{
	int b=200;
	void call()	//Method Overrinding
	{
		int sum=a+b;
		System.out.println("Sub Class Son");
		System.out.println("Addition="+sum);
	}
}
class Daughter extends Father	//Sub Class Daughter
{
	int c=20;
	void call()	//Method Overrinding
	{
		int mult=a*c;
		System.out.println("\nSub Class Daughter");
		System.out.println("Multiplication="+mult);
	}
}