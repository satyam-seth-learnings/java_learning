class Geekyshows
{
	public static void main(String args[])
	{
		Test obj=new Test();
		Test obj1=new Test();
		obj.mark=100;
		obj1.mark=200;
		System.out.println("Marks="+obj.mark);
		System.out.println("Marks="+obj1.mark);
	}
}
class Test
{
	static int mark;	//static variable
}
	