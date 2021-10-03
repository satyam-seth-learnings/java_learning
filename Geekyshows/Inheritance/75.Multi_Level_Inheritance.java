class Geekyshows
{
	public static void main(String args[])
	{
		GrandSon obj=new GrandSon();
		obj.getdata(10,20);	//Calling Method Of Super Class
		obj.disp();	//Calling Method Of Sub Class
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
class Son extends Father	//Intermediate Sub Class
{
	int c=30;
	int add()	//Method
	{
		int sum=a+b+c;
		return sum;
	}
}
class GrandSon extends Son	//Sub Class
{
	void disp()	//Method 
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("C="+c);
		System.out.println("Sum="+add());
	}
}