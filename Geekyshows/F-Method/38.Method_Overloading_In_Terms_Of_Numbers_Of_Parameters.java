class Geekyshows
{
	public static void main(String args[])
	{
		Addition obj=new Addition();
		obj.disp(10);
		obj.disp(10,20);
	}
}
class Addition
{
	void disp(int a)	//Instance Method
	{
		int x=a;
		System.out.println("Value of A="+x);
	}
	void disp(int a,int b)	//Instance Method	
	{
		int x=a;
		int y=b;
		int z=x*y;
		System.out.println("Multiplication="+z);
	}
}		