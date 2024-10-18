import java.util.*;
public class loopp{
	public static void main(String[] arugs)
	{
		int a;
		int i=0;
		System.out.println("Enter the number:");
		Scanner input= new Scanner(System.in);
		a=input.nextInt();
		System.out.println("you have enterd:"+a);
		for(i=0;i<a;i++)
		{
			if(i==30)
			{
			  continue;
			}
			if(i==28)
			{
				continue;
			}
			else{
				System.out.println("Value:"+i);
			}
		}
		
		
	}
	
}