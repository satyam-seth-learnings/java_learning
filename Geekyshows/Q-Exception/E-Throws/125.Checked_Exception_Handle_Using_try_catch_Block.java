import java.io.*;
class Geekyshows
{
	public static void main(String args[])
	{
		Runtime rt=Runtime.getRuntime();
		String file="c:/Example/test.txt";
		try
		{
			Process p=rt.exec("notepad "+file);
		}
		catch(IOException e)
		{
			System.out.println("File Not Found!");
		}
	}
}