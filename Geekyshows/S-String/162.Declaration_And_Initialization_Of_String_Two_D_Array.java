public class Geekyshows
{
	public static void main(String args[])
	{
		String name[][]= {
							{"geeky","shows","subscribe","youtube"},
							{"channel","like","share","video"},
							{"comment","thank","you","viewers"}
						 };
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("name["+i+"]["+j+"]="+name[i][j]);
			}
		}
	}
}