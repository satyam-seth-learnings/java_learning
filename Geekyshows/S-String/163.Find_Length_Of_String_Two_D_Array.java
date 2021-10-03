public class Geekyshows
{
	public static void main(String args[])
	{
		String name[][]= {
							{"geeky","shows","subscribe","youtube"},
							{"channel","like","share","video"},
							{"comment","thank","you","viewers"}
						 };
		System.out.println("Row Size="+name.length);
		System.out.println("Column Size="+name[0].length);
		System.out.println("Length Of subscribe="+name[0][2].length());
	}
}