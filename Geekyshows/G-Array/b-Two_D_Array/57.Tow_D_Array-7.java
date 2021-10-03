import java.util.Scanner;
class Geekyshows 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int m=obj.nextInt();
		System.out.print("Enter number of column:");
		int n=obj.nextInt();
		int num[][]=new int[m][n];
		System.out.println("Enetr Values:");
		for(int i=0;i<num.length;i++)	//Or	for(int i=0;i<m;i++)
		{
			for(int j=0;j<num[0].length;j++)	//Or	for(int j=0;j<n;j++)
			{
				num[i][j]=obj.nextInt();
			}
		}
		System.out.println("You Entered:");
		for(int i=0;i<m;i++)	//Or	for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<n;j++)	//Or	for(int j=0;j<num[0].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out .println();
		}
	}
}