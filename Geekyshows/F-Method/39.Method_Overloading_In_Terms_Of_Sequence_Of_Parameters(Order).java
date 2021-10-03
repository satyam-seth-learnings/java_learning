class Geekyshows
{
	public static void main(String args[])
	{
		Addition obj=new Addition();
		obj.disp(12.5f,5);
		obj.disp(5,12.0f);
	}
}
class Addition
{
	void disp(float a,int b)	//Instance Method
	{
		float x=a;
		int y=b;
		float z=x+y;
		System.out.println("Addition="+z);
	}
	void disp(int a,float b)	//Instance Method 
	{
		int x=a;
		float y=b;
		float z=x*y;
		System.out.println("Multiplication="+z);
	}
}
	