import java.util.*;
public class Prime{
	
          public static void main(String[] args)
		  {
			     int a,b=0;
				 int i=2;
				 int pr=0;
				 System.out.println("Enter the number for a");
				 Scanner input=new Scanner(System.in);
				 a=input.nextInt();
				 System.out.println("you have entered no."+a+"as a a value");
				 b=a/2;
				 
				 for( i=2;i<=b;i++)
				 {
					 if(a%i==0)
					 {
						  System.out.println(a+"is  not prime number");
						  pr=1;
						  break;
						 
					 }
				 }
				 if(pr==0)
				 {
					 System.out.println("your entered number "+a+"is a prime number");
				 }
				 
						 
		  }
}