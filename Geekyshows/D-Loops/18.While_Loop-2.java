import java.util.Scanner;
class Geekyshows
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int i;
		System.out.println("Enter 0 to Exit");
		while(true)
		{
			System.out.println("Enter any Integer Value");
			i=obj.nextInt();
			if(i==0)
			{
				System.out.println("Program End");
				break;
			}
			System.out.println("You Entered:"+i);
		}
	}
}