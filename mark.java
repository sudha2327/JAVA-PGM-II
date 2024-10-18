import java.lang.Cloneable;
class mark implements Cloneable
{
	int a;
	String s;
	public mark(int i, String s)
	{
        this.i=i;
		this.s=s;
		
     }
    @Override
    protected Object clone() 
    throws CloneNotSupportedException{
        return super.clone();
	   
	}		
	
}
public class Test
{
	public static void main(String[] args)
	{
		mark m=new mark(3000,"sudhagar");
		mark  n=(mark)m.clone();
		System.out.println(n.a);
		System.out.println(n.s);
	}
	
}