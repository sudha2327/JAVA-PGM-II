import java.util.*;
public class Arms
{
	public static void main(String[] args)
	{
		int a,b,sum=0,temb;
		System.out.println("Enter the value:");
		
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		temb=a;
		while(a>0)
		{
			b=a%10;
			sum=sum+(b*b*b);
			a=a/10;
		}
		if(temb==sum)
		{
		  System.out.println("your given number is armstrong");
		}else{
			System.out.println("your given number not an armstrong");
		}
	}
}