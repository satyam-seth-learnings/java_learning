import java.util.Scanner;
class Geekyshows
{
	public static void main(String args[])
	{
		try 
		{
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter A:");
			int a=obj.nextInt();
			System.out.print("Value of B:");
			int b=obj.nextInt();
			int c=a/b;
			System.out.println("Division="+c);
			System.out.println("Rest Of The Code");
			System.out.println("Program Continue");
		}
		catch(ArithmeticException e)
		{
			System.out.println("division By Zero Not Possible");
		}
		System.out.println("After catch Program End");
	}
}