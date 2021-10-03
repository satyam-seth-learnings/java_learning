public class Geekyshows
{
	public static void main(String args[])
	{
		String name[][]=new String[3][4];
		name[0][0]="geeky";
		name[0][1]="shows";
		name[0][2]="subscribe";
		name[0][3]="youtube";
		name[1][0]="channel";
		name[1][1]="like";
		name[1][2]="share";
		name[1][3]="video";
		name[2][0]="comment";
		name[2][1]="thank";
		name[2][2]="you";
		name[2][3]="viewers";
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("name["+i+"]["+j+"]="+name[i][j]);
			}
		}
	}
}