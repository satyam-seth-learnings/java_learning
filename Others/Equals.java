import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int x,y;
	System.out.println("Enter the Ferst Number:");
	x=scan.nextInt();
	System.out.println("Enter the Second Number:");
	y=scan.nextInt();
	System.out.println("Enter the Operater:");
	String operations=scan.next();
    if(operations.equals("+"))
	{
		System.out.println("This is the Addition Result:"+(x+y));
	}
	else if(operations.equals("-"))
	{
		System.out.println("This is the Substraction Result:"+(x-y));
	}
	else if(operations.equals("*"))
	{
		System.out.println("This is the Multiplication Result:"+(x*y));
	}
	else if(operations.equals("/"))
	{
		System.out.println("This is the Division Result:"+(x/y));
	}
	else
	{
		System.out.println("Enter the Currect Operator");
	}
}
}
