public class Geekyshows
{
	public static void main(String args[])
	{
		char a[]=new char[5];	// char a[]={'G','E','E','K','Y'};
		a[0]='G';		//
		a[1]='E';		//
		a[2]='E';		//
		a[3]='K';		//
		a[4]='Y';		//
		for(int i=0;i<5;i++)	// for(char b:a)	//Enhanced for Loop
		{
			System.out.println("a["+i+"]="+a[i]);	// System.out.println(b); 
		}
	}
}