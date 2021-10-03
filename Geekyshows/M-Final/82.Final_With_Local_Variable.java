class Geekyshows
{
	public static void main(String args[])
	{
		Geek obj=new Geek();
		obj.disp();
	}
}
class Geek
{
	void disp()
	{
		final int roll=101;	//Or	final int roll;
							//		roll=101;
		System.out.println("Roll="+roll);
	}
}