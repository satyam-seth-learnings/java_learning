import java.util.Scanner;
public class Geekyshows
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Name:");
		String Name;
		Name=obj.nextLine();
		System.out.println("Name= "+Name);
		System.out.print("Enter Company Name:");
		String CompanyName;
		CompanyName=obj.next();
		System.out.println("CompanyName= "+CompanyName);
	}
}