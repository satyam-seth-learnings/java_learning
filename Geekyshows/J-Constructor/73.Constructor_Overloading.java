class Geekyshows
{
	public static void main(String args[])
	{
		Test obj=new Test(10);
		Test obj1=new Test(20.56f);
		Test obj2=new Test(10,20);
	}
}
class Test
{
	int x,z,k;	//Instance Variable
	float y;	//Instance Variable
	Test(int a)	//Parameterized Constructor
	{
		x=a;
		System.out.println("X:"+x);
	}
	Test(float a)	//Parameterized Constructor
	{
		y=a;
		System.out.println("Y:"+y);
	}
	Test(int a,int b)	//Parameterized Constructor
	{
		z=a;
		k=b;
		System.out.println("Z:"+z);
		System.out.println("K:"+k);
	}
}