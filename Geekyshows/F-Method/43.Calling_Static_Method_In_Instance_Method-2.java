class Geekyshows
{
	public static void main(String args[])
	{
		Test1 obj=new Test1();
		obj.disp();
	}
}
class Test 
{
	static int add()	//Static Method 
	{
		int x=10,y=20;	//Local Variable 
		int z=x+y;
		return z;
	}
}
class Test1
{
	void disp()	//Istance Method 
	{
		int a=Test.add();	//Calling Static Method 
		System.out.println("Addition="+a);
	}
}			