import java.util.*;
public class factor{
	public static void main(String[] arugs)
	{
		int n,i=0;
		System.out.println("Enter the value:");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		System.out.println("You have entered:");
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("values:"+i);
			}
		}
	}
	
}