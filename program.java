public class Vehicle{
	private String color;
	public String getcolor()
	{
		return color;
	}
    public void setcolor(String[] c)
	{
		this.color=c;
	}
}

class program{
	public static void main(String[] args)
	{
		Vehicle v1=new Vehicle();
		v1.setcolor("red");
		System.out.println(v1.getcolor());
	}
}