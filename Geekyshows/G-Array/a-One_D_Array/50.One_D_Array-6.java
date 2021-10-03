import java.util.Scanner;
class Geekyshoes
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Number Of Elements:");
		int n=obj.nextInt();
		int num[]=new int[n];
		System.out.println("Enter"+" "+n+" "+"Integers");
		for(int i=0;i<n;i++)	//Or	for(int i=0;i<num.length;i++)
		{
			num[i]=obj.nextInt();
		}
		System.out.println("You Entered:");
		for(int i=0;i<n;i++)	//Or	for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}