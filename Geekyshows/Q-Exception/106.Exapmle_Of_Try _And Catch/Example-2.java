import java.util.Scanner;
class Geekyshows
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter A:");
		int a=obj.nextInt();
		System.out.print("Value of B:");
		int b=obj.nextInt();
		try
		{
			int c=a/b;
			System.out.println("Division="+c);
		}
		catch(ArithmeticException e)
		{
																	//Or int d=100/0;
																	//Or System.out.println("D="+d);
			System.out.println("division By Zero Not Possible");
		}
		System.out.println("After catch Program End");
	}
}