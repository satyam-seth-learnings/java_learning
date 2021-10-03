import java.util.Scanner;
class LowbalanceException extends RuntimeException
{
	public LowbalanceException()
	{
		super("Insufficient balance");
	}
}
class Exceptiontest
{
	public void atm(int m)
	{
		int money=m;
		Scanner sc=new Scanner(System.in);
		System.out.print("Withdraw Amount=");
		int withdraw=sc.nextInt();
		if(money<withdraw)
		{
			try 
			{
				throw new LowbalanceException();
			}
			catch(LowbalanceException e)
			{
				System.out.println("Insufficient balance");
			}
		}
		else
		{
			int remain=money-withdraw;
			System.out.println("Remain="+remain);
		}
	}
}
class Geekyshows
{
	public static void main(String args[])
	{
		Exceptiontest obj=new Exceptiontest();
		obj.atm(10000);
	}
}