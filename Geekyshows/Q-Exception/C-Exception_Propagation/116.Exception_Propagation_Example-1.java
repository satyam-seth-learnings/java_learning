package miann;
class Geekyshows
{
	public static void main(String args[])
	{
		Geekyshows obj=new Geekyshows();
		System.out.println("Hello");
		obj.getdata();
	}
	void getdata()
	{
		System.out.println("Hello Getdata First");
		getdata1();
		System.out.println("Hello Getdata");
	}
	void getdata1()
	{
		System.out.println("Hello Getdata Second");
		int a=100/2;	//Or	int a=100/0;
		System.out.println("A:"+a);
	}
}