class Geekyshows
{
	public static void main(String args[])
	{
		Geek obj=new Geek();
		int a=10;
		int sum=a+obj.roll;
		System.out.println("Sum="+sum);
	}
}
class Geek
{
	final int roll=101;
}