class Geekyshows
{
	public static void main(String args[])
	{
		Test obj=new Test();
		obj.mark=200;
		System.out.println("Roll="+obj.roll);
		System.out.println("Marks="+obj.mark);
	}
}
class Test
{
	int roll=10;	//instance variable
	int mark;	//instance variable
}
	