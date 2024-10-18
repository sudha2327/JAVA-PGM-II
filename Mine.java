import java.util.*;
public class Mine{
	 public static void main(String[] agrs)
	 {
         int a,b,c;
		 String x;
		 Scanner input=new Scanner(System.in);
		 System.out.println("enter the input ");
		 a=input.nextInt();
		 System.out.println("your a value is"+" "+a);
		 b=input.nextInt();
		 System.out.println("your b value is"+" "+b);
		 x=input.next();
		 System.out.println("your choice char is"+""+x);
		 switch(x){
			 case "add":
			            c=a+b;
				        System.out.println("addition is "+c);
				        break;
			case "sub":
			           c=a-b;
					   System.out.println("subration is"+c);
					   break;
			case "mul":
			          c=a*b;
					  System.out.println("multiplication is"+c);
					  break;
					  
		   default:
		             System.out.println("invaild str");
		 }
	 }
}
			           
			  
          
	 