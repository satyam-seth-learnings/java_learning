class Geekyshows
{
	public static void main(String args[])
	{
						//Or Test obj=new Test();
		Test.disp();	//Or obj.disp();
	}
}
class Test
{
	static void disp()	//Static Method
	{
		int x=10;	//Local Variable
		System.out.println("Value Of A="+x);
	}
}