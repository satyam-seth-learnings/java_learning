public class Geekyshows
{
	public static void main(String args[])
	{
		String name[]=new String[3];
		name[0]="Geeky";
		name[1]="Shows";
		name[2]="Youtube Channel";
		for(int i=0;i<3;i++)							//Or	for(String b:name)
		{
			System.out.println("name["+i+"]="+name[i]);	//Or	System.out.println(b);
		}
	}
}