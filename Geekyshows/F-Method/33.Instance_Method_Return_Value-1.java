class Geekyshows
{
	public static void main(String args[])
	{
		Test obj=new Test();
		System.out.println(obj.add());	//Or System.out.println("Additon="+obj.add());
		int r=obj.mult(5);
		System.out.println(r);	//Or System.out.println("multiplication="+r);
	}
}
class Test 
{
	int add()	//instace method without parameter
	{
		int a=10,b=20;	//local veriable
		return(a+b);
	}
	int mult(int p)	//instance method with parameter
	{
		int k=p;	//local veriable 
		return(k*k);
	}
}