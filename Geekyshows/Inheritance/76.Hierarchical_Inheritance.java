class Geekyshows 
{
	public static void main(String args[])
	{
		Son objs=new Son();
		Daughter objd=new Daughter();
		objs.getdata(10,20);	//Calling Method Of Super Class Father
		objs.disp();	//Calling Method Of Super Class Son
		objd.getdata(20,30);	//Calling Method Of Super Class Father
		objd.disp();	//Calling Method Of Sub Class Daughter
	}
}
class Father	//Super Class 
{
	int a,b;
	void getdata(int x,int y)	//Method With Parameter
	{
		a=x;
		b=y;
	}
}
class Son extends Father//Sub Class Son
{
	int add()	//Method 
	{
		return (a+b);
	}
	void disp()	//Method
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("Sum="+add());
	}
}
class Daughter extends Father	//Sub Class Daughter
{
	int mult()
	{
		return(a*b);
	}
	void disp()	//Method
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("Multiplication="+mult());
	}
}