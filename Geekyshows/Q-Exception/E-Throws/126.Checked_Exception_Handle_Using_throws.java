import java.io.*;
class Geekyshows
{
	public static void main(String args[])	throws IOException
	{
		Runtime rt=Runtime.getRuntime();
		String file="c:/Example/test.txt";
		Process p=rt.exec("notepad "+file);
	}
}