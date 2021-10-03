class Geekyshows
{
	public static void main(String args[])
	{
		Son s=new Son();
		Daughter d=new Daughter();
		s.disp();	//Calling Method Of Sub Class Son
		d.disp();	//Calling Method Of Sub Class Daughter
	}
}
abstract class Father	//Super Class,Abstract Class 
{
	abstract void disp();	//Abstract Method
}
class Son extends Father	//Sub Class	Son
{
	void disp()
	{
		System.out.println("Abstract Method In Sub Class Son");
	}
}
class Daughter extends Father	//Sub Class Daughter
{
	void disp()
	{
		System.out.println("Abstract Method In Sub Class Daughter");
	}
}