public class Geekyshows
{
	public static void main(String args[])
	{
		char a[][]=new char[3][4];	//Or	char a[][]={{'g','e','e','k'},{'y','s','h','o'},{'w','s','a','b'}};	
		a[0][0]='g';	//
		a[0][1]='e';	//
		a[0][2]='e';	//	
		a[0][3]='k';	//
		a[1][0]='y';	//
		a[1][1]='s';	//
		a[1][2]='h';	//
		a[1][3]='o';	//
		a[2][0]='w';	//
		a[2][1]='s';	//
		a[2][2]='a';	//
		a[2][3]='b';	//
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("  a["+i+"]["+j+"]="+a[i][j]); 
			}
			System.out.println("");
		}
	}
}