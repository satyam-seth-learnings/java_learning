class Geekyshows
{
	public static void main(String args[])
	{
		Addition obj=new Addition();
		obj.disp(20);
	}
}
class Addition
{
	void disp(int a)	//instance veriable
	{
		int x=10,y=a;
		int z=x+y;
		System.out.println("Addition="+z);
    }
}
	