import java.util.Scanner;
public class Geekyshows
{
	public static void main(String args[])
	{
		char a[]=new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Characters:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
			
	}
}