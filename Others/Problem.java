class Geekyshows{
	public static void main(String args[]) {
		Example obj=new Example();
		obj.dip();
	}
}
class Example{
	void dip() {
	Test.disp();
	}
}
class Test{
	static void disp() {
		System.out.println("Satyam Seth");
	}
}






class Example{
	Test ob=new Test();
	ob.disp();
	
}

class Example{
	Test.disp();
	
}