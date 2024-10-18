public class Vokol{
	private String color;
	Vokol (){
		this.setcolor("redddd");
	}
	Vokol(String c){
		this.setcolor(c);
	}
	public void setcolor(String c){
		this.color=c;
	}
	public  String getcolor(){
		return color;
	}
	
	}
class MyClass{
	public static void main(String[] args)
	{
		Vokol obj=new Vokol();
		Vokol obj1=new Vokol("greeen");
		System.out.println(obj1.getcolor());
		System.out.println(obj.getcolor());
	}
}