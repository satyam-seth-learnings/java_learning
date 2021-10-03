public class Geekyshows
{
	public static void main(String args[])
	{
		char a='A';
		char b='7';
		System.out.println(Character.isWhitespace(a));
		System.out.println(Character.isWhitespace(b));
		System.out.println(Character.isWhitespace(0));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isWhitespace(' '));
	}
}