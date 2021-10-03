import java.util.Scanner;
class LowbalanceException extends Exception
{
	public LowbalanceException()
	{
		super("Insufficient balance");
	}
}
class Exceptiontest
{
	public void atm(int m)	throws LowbalanceException
	{
		int money=m;
		Scanner sc=new Scanner(System.in);
		System.out.print("Withdraw Amount=");
		int withdraw=sc.nextInt();
		if(money<withdraw)
		{
			throw new LowbalanceException();
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
		try
		{
			obj.atm(10000);
		}
		catch(LowbalanceException e)
		{
			System.out.println(e);
		}
	}
}