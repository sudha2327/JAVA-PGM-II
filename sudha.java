import java.util.*;

interface hellow{
	public void hii();
	public void key();
}
class sudha implements hellow{
	 String s="welcome my world";
	public void hii(){
		System.out.println("hii this sudhagar");
	}
	public void key(){
		System.out.println("hey guys"+s+".......");
		
	}
}
class Myclass{
	public static void main(String [] args)
	{
		sudha obj=new sudha();
		obj.hii();
		obj.key();
	}
}