import java.util.*;
interface mine{
	public void hay();
}
interface mineb extends mine{
	public void hai();
}
class inter implements mineb{
	
	int a,b,c,d;
	void inter(){
		System.out.println("enter the values:");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
	
}
    
	public void hay(){
		c=a+b;
		System.out.println("...........................................");
		System.out.println(".................this for hay() operations..............");
		System.out.println("now i am gonna to add these two values "+c);
	 
 }
 public void hai(){
	 d=a-b;
	 System.out.println(".....................................");
	 System.out.println("........this for hai() operation........");
	 System.out.println("now iam gonna to subtracting two values"+d);
 
}

}
class MyClass{
	public static void main(String  args[]){
		inter in=new inter();
		in.inter();
		in.hay();
		in.hai();
	}
}