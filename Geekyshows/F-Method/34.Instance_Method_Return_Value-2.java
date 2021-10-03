class Geekyshows
{
	public static void main(String args[])
	{
		Test obj=new Test();
		System.out.println("First Name:"+obj.fname());
		String lastname=obj.lname("Shows");
		System.out.println("Last Name:"+lastname);
	}
}
class Test
{
	String fname()	//Instance Method 
	{
		String s="Geeky";	//Local Veriable
		return s;
	}
	String lname(String st)	//Instance M<ethod 
	{
		String str=st;	//Local Veriable
		return str;
	}
}