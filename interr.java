import java.util.*;
interface hii1{
 public void call();	
}
interface hii2{
	public void debit();
}
interface hii3 {
   
   public void credit();
   public void display();
}

class interr implements hii3,hii1,hii2{
	int account_no,balance,amount_credit,amount_debit;
	String name;
	public void call(){
		Scanner input=new Scanner(System.in);
		System.out.println("..........Now give the user details..........");
		System.out.println("enter the account number");
		account_no=input.nextInt();
		System.out.println("enter the name:");
		Scanner n=new Scanner(System.in);
		name=n.nextLine();
		System.out.println("enter the amount");
		balance=input.nextInt();
	}
	public void debit( int  amount){
		amount_debit=balance-amount;
	}
	public void credit(int  amount){
		amount_credit=balance-amount;
	}
	public void display()
	{   System.out.println(".............................................................");
	    System.out.println("................FINAL OUTPUT.................................");
		System.out.println("account number/t/t/t"+"name/t/t/t"+"amount/t/t/t");
		System.out.println(account_no+"/t/t/t"+name+"/t/t/t"+balance+"/t/t/t");
		System.out.println("                                  "+amount_credit);
		System.out.println("                                   "+amount_debit);
		}


	public static void main(String args[]){
		int amount;
		 interr in=new interr();
		in.call();
		System.out.println("enter the amount for doing operation");
		Scanner i=new Scanner(System.in);
		amount=i.nextInt();
		in.credit(amount);
		in.debit(amount);
		
	}
}