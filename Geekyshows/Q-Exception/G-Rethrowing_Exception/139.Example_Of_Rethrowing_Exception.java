public class Geekyshows
{
	public static void main(String[] args)
	{
		try
		{
			getdata();	//	exception occur
			getdata1();	//	exception occur
		}
		catch(ArithmeticException ex)	//	method exception handled
		{
			System.out.println("Handled in Main Method");
		}
	}
	static void getdata()
	{
		try
		{
			int a=100/2;	//	int a=100/0;
			System.out.println("A:"+a);
		}
		catch(ArithmeticException e)
		{
			throw e;
		}
	}
	static void getdata1()
	{
		try
		{
			int b=100/0;	//	int b=100/2;
			System.out.println("B:"+b);
		}
		catch(ArithmeticException e)
		{
			throw e;
		}
	}
}