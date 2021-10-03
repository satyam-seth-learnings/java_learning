import java.util.Scanner;
class Geekyshows{
	public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		char a;
		System.out.print("Enter the character:");
		a=ob.next().charAt(0);
		switch(a) {
		case '1':
			System.out.println("One");
			break;
		case '2':
			System.out.println("Two");
			break;
		default:
			System.out.println("Wroang Choice!");
			break;
		}
	}
}