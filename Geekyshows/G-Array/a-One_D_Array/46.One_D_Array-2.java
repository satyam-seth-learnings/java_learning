import java.util.Scanner;
class Geekyshows
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int num[]=new int[5];
		System.out.println("Enter5 Integer Values:");
		for(int i=0;i<5;i++)
		{
			num[i]=obj.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(num[i]);
		}
	}
}