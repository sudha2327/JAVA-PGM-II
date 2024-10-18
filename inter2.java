import java.util.*;
interface hii1{
	public void hellow();
}
interface hii2{
	public void hellow1();
}
class inter2 implements hii1,hii2{
	public void hellow()
	{
		System.out.println("hiiii..........");
	}
	public void hellow1()
	{
	   System.out.println("hii this sudhagar!!!!");	
		
	}
	public static void main(String args[])
	{
		inter2 in=new inter2();
		in.hellow();
		in.hellow1();
	}
}