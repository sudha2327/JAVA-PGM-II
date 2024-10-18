import java.util.*;
public class reverse{
    public static void main(String[] args)
	{
		int a,b,rev=0,given_number;
		System.out.println("Enter the value");
	    Scanner input=new Scanner(System.in);
		a=input.nextInt();
		given_number=a;
		System.out.println("you have entered:"+a);
		while(a>0)
		{
			b=a%10;
			rev=rev*10+b;
			a=a/10;
			
			
		}
		System.out.println("your value"+" "+rev);
		if(given_number==rev){
			System.out.println("Given number is palindrome");
		}
		else{
			System.out.println("given number is not an palindrome");
		}
	}

}