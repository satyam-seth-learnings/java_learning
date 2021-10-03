class Geekyshows
{
	public static void main(String args[])
	{
		Geek obj=new Geek();
		obj.disp(10);
	}
}
class Geek
{
	void disp(final int a)
	{
		System.out.println("Roll="+a);
	}
}