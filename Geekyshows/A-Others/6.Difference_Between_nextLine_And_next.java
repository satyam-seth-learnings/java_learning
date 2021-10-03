import java.util.Scanner;
class Satyam
{
	public static void main(String args[])
	{
		String str1,str2;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter First String:");
		str1=obj.nextLine();	
		System.out.println("String:"+str1);
		System.out.print("Enter Second String:");
		str2=obj.next();
		System.out.println("String:"+str2);
	}
}