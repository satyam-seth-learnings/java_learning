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
	void disp()	//Instance Method 
	{
		Test1 ob=new Test1();
		int x=ob.add();
		System.out.println("Additon="+x);
	}
}
class Test1
{
	int add()	//Instance Method
	{
		int a=10,b=20;
		int z=a+b;
		return z;
	}
}