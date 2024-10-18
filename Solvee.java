public class  Solvee{
	protected int age;
	public void than(){
		System.out.println("hii this for inhertences:>>>?");
	}
}
class DOg extends Solvee{
	public void DOg(){
		String s="hiiiii";
	}
}
class MyClass{
	public static void main(String[] args){
		DOg d=new DOg();
		d.than();
	}
}