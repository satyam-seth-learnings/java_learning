import java.util.Scanner;
public class Geekyshows
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name[]=new String[3];
		System.out.println("Enter 3 Strings:");
		for(int i=0;i<3;i++)
		{
			name[i]=sc.nextLine();
		}
		System.out.println("You Entered:");
		for(int i=0;i<3;i++)
		{
			System.out.println("name["+i+"]="+name[i]);
		}
	}
}