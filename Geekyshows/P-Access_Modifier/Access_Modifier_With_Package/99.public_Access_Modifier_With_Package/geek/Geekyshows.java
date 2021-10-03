package geek;
import package1.*;
import package2.*;
public class Geekyshows 
{
	public static void main(String args[])
	{
		Mobile objm=new Mobile();
		Laptop objl=new Laptop();
		Dell objd=new Dell();
		Computer objc=new Computer();
		HP objh=new HP();
		objm.dispm();
		objl.displ();
		objd.dispd();
		objc.dispc();
		objh.disph();
	}
}