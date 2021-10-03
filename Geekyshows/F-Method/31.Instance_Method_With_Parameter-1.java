class Gekkyshows
{
	public static void main(String args[])
	{
		Geekyshows obj=new Geekyshows();
		obj.disp(10,20);	//Calling instance method and passing value
		System.out.println("Geekyshows");
	}
	void disp(int a,int b)	//instance method with parameters
	{
		int x=a;	//local variable
		int y=b;	//local variable
		int z=x+y;	//local variable
		System.out.println(z);
	}
}