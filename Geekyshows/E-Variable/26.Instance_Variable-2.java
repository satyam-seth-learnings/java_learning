class Geekyshows
{
	public static void main(String args[])
	{
		Test obj=new Test();
		Test obj1=new Test();
		obj1.mark=300;
		obj1.roll=20;
		obj.mark=200;
		System.out.println("Roll="+obj1.roll);
		System.out.println("Marks="+obj1.mark);
		System.out.println("Roll="+obj.roll);
		System.out.println("Marks="+obj.mark);
	}
}
class Test
{
	int roll=10;	//instance variable
	int mark;	//instance variable
}