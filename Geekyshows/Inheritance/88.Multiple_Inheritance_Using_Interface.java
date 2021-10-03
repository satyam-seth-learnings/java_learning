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
	int a=10;	//Instance Variable
	int add(int y)	//Method
	{
		int b=y;	//Local Variable 
		return(a+b);
	}
}
interface Mother	//interface
{
	int c=30;	//public static final
	void disp();
}
class Son extends Father implements Mother	//Extends And Implements Together
{
	int m=a*Mother.c;	//Accesing Class And Interface Variable
	int sum=add(20);	//Calling Method
	public void disp()	//Defining Interface Abstract Method
	{
		System.out.println("Adition="+sum);
		System.out.println("Multiplication="+m);
	}
}
	