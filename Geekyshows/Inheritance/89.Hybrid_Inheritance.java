class Geekyshows
{
	public static void main(String args[])
	{
		Result obj=new Result();
		obj.disp();
	}
}
class Student	//Super Class 
{
	int roll=101;
	int practical=50;
}
class Exam extends Student	//Sub Class
{
	int theory=100;
	int pm=theory+practical;
}
interface Project	//Interface
{
	int pmark=200;	//public static final
	void disp();	//Abstract Method
}
class Result extends Exam implements Project	//Extends And Imlements Together
{
	int sum=pm+Project.pmark;
	public void disp()	//Defining Interface Abstract Method
	{
		System.out.println("Roll="+roll);
		System.out.println("Theory="+theory);
		System.out.println("Practical="+practical);
		System.out.println("Project="+Project.pmark);
		System.out.println("Total Marks="+sum);
	}
}