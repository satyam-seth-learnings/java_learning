import java.util.Scanner;
class Geekyshows
{
	public static void main(String args[])
	{
		int money=10000;
		Scanner sc=new Scanner(System.in);
		System.out.print("Withdraw Amount=");
		int withdraw=sc.nextInt();
		int remain=money-withdraw;
		System.out.println("Remain="+remain);
	}
}