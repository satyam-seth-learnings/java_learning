class Geekyshows
{
	public static void main(String args[])
	{
		Test obj=new Test();
		obj.disp();
	}
}
class Test
{
	int add()	//Instance Method
	{
		int a=10,b=20;
		int z=a+b;
		return z;
	}
	void disp()	//Instance Method
	{
		int x=add();	//Calling Instance Method Inside Instance Method
		System.out.println("Addition="+x);
	}
}
	