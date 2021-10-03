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
	static int add()	//Styatic Method 
	{
		int x=10,y=20;	//Local Variable
		int z=x+y;
		return z;
	}
	void disp()	//Instance Method 
	{
		int a=add();	//Calling Static Method
		System.out.println("Addition="+a);
	}
}