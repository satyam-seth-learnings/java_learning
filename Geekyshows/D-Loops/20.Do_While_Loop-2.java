import java.util.Scanner;
class Geekyshows
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int i;
		System.out.println("Enter 0 to Exit");
		do
		{
			System.out.println("Enter any Integer Value:");
			i=obj.nextInt();
			System.out.println("You Entered:"+i);
		}while(i!=0);
	}
}