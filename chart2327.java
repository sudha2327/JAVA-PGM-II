import java.util.*;
public class chart2327{
	public static void main(String[] args){
		char first_character,second_charcter;
		System.out.println("Enter the charcter:");
		Scanner input=new Scanner(System.in);
		first_character=input.next().charAt(0);
		second_charcter=input.next().charAt(0);
		int ASCII_value_1= first_character;
		int ASCII_value_2=second_charcter;
		System.out.println("ASCII value of ur first_character is"+" "+ASCII_value_1);
		System.out.println("ASCII value of ur second_charcter is"+" "+ASCII_value_2);
		System.out.println("Now u should select the options: " );
		System.out.println("addition-add");
		System.out.println("subtraction-sub");
		System.out.println("multiplication-multi");
		System.out.println("division-div");
		String choice;
		Scanner mine=new Scanner(System.in);
        choice=mine.next();
        System.out.println("you have choosen"+choice);
		System.out.println("Are u ready to start the process yes-y(or)Y or no-no N (or)n");
		char ch;
		Scanner hlo=new Scanner(System.in);
		ch=hlo.next().charAt(0);
		do{
		switch(choice)
		{
			case "add":
			        int  add=ASCII_value_1+ASCII_value_2;
					System.out.println("addition : "+add);
					break;
			case "sub":
			        int sub=ASCII_value_1-ASCII_value_2;
					System.out.println("subtraction:"+sub);
					break;
			case "multi":
			         int multi=ASCII_value_1*ASCII_value_2;
					 System.out.println("multiplication:"+multi);
					 break;
			case "div":
			         int div=ASCII_value_1/ASCII_value_2;
					 System.out.println("division"+div);
					 break;
					 
		   default:
		         System.out.println("Oopps....your given choice is not here.Pls enter crt keyword!!!");
		}
		}while(ch=='y'|| ch=='Y');
		
		
		}
				 
				 
					 
}