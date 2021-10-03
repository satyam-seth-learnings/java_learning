class Geekyshows
{
	public static void main(String args[])
	{
		Son obj=new Son();
		obj.getdata(10,20);	//Calling Method Of Super Class
		obj.disp();	//Calling Method Of Sub Class
	}
}
class Father	//Super Class
{
	int a,b;	//Instance Variable 
	void getdata(int x,int y)	//Instance Variable
	{
		a=x;
		b=y;
	}
}
class Son extends Father	//Sub Class
{
	int add()	//Method
	{
		int sum=a+b;
		return sum;
	}
	void disp()	//Method
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("Sum="+add());
	}
}