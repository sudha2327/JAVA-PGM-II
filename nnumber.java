import java.util.*;
public class nnumber{
	public static void main(String[] arugs)
	{
		int n,i,sum=0;
		System.out.println("Enter the value:");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		System.out.println("you have entered"+n);
		for(i=1;i<=n;i++)
		{   sum=sum+i;
			
		}
		System.out.println("Value:"+sum);
	}
}