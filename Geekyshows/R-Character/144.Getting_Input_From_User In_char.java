import java.util.Scanner;
public class Geekyshows
{
	public static void main(String args[])
	{
		char a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Gender M/F:");
		a=sc.next().charAt(0);	//Or	a=sc.next().charAt(2);
		System.out.println("You Entered:"+a);
	}
}