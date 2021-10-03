class Geekyshows
{
	public static void main(String args[])
	{
		int a=20,x=30;
		int b=10,y=40;
		boolean c=(a<x)&&(b<y);
		boolean d=(a>x)||(b<y);
		boolean e=!(a>x);
		System.out.println("Result:"+c);
		System.out.println("Result:"+d);
		System.out.println("Result:"+e);
	}
}