import java.util.Scanner;
class Satyam
{
	public static void main(String orgs[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the no. of Rows:");
		int r=obj.nextInt();
		int num[][]=new int[r][];
		int col[]=new int[r];
		for(int i=0;i<r;i++)
		{
			System.out.print("Enter the no. of elements in Row no. "+(i+1)+":");
			col[i]=obj.nextInt();
		}
		for(int i=0;i<r;i++)
		{
			System.out.print("Enter the "+col[i]+" Elements in Row "+(i+1)+":");
			for(int j=0;j<col[i];j++)
			{
				num[i][j]=obj.nextInt();
			}
		}	
		for(int i[]:num)
		{
			for(int j:i)
			{
				System.out.println(j);
			}
		}
	}
}