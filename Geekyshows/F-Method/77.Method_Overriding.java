class Geekyshows
{
	public static void main(String args[])
	{
		Father f=new Father();
		Son s=new Son();
		Daughter d=new Daughter();
		f.cal();	//Calling Method Of Super Class Father
		s.cal();	//Calling Method Of Sub Class Son
		d.cal();	//Calling Method Of Sub Class Daughter
	}
}
class Father	//Super Class 
{
	int a=100;
	void cal()	//Method
	{
		System.out.println("Super Class Father\n");
	}
}
class Son extends Father	//Sub Class Son
{
	int b=200;
	void cal()	//Method Overriding
	{
		int sum=a+b;
		System.out.println("Sub Class Son");
		System.out.println("Addition="+sum);
	}
}
class Daughter extends Father	//Sub Class Daughter
{
	int c=20;
	void cal()	//Method
	{
		int multi=a*c;
		System.out.println("\nSub Class Daughter");
		System.out.println("Multiplication="+multi);
	}
}