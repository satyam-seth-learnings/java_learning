package miann;
import java.util.Scanner;
public class Geekyshows 
{
	public static void main(String args[])
	{
		try
		{
			int a=100/2;							//Or	int a=100/0;			//Or	int a=100/2;				//Or	int a=100/2;		//Or	int a=100/0;	
			System.out.println("A:"+a);
			int arr[]=new int [5];
			arr[4]=8;								//Or	arr[4]=8;				//Or	arr[8]=8;					//Or	arr[4]=8;			//Or	arr[8]=8;
			System.out.println("arr[4]="+arr[4]);
			String st="Geekyshows";					//Or	String st="Geekyshows";	//Or	String st="Geekyshows";		//Or	String st=null;		//Or	String st=null;
			System.out.println(st.length());
		}
		catch(Exception e)
		{
			System.out.println("Not Possible");
		}
	}
}
