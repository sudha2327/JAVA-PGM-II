import java.util.Scanner;
public class Accountsvs{
	
	 int cust_id;
	 String cust_name;
	 int balance;
	 float interset;
	 int credit_balance;
	 int debit_balance;
	 float add_interst;
	 int amount;
	 int addinterst;
	 Accountsvs(){
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter the customer details:");
	 System.out.println("customer id:");
	 cust_id=input.nextInt();
	 System.out.println("customer name:");
	 Scanner inp=new Scanner(System.in);
	 cust_name=inp.next();
	 System.out.println("balance:");
	 balance=input.nextInt();
	 System.out.println("interset:");
     interset=input.nextFloat();
	 }
	 
     void credit(int amount){
        credit_balance=balance+amount;
		
	 }		 
	 void debit(int amount){
	     debit_balance=balance-amount;
		
	 }
	 void add_interst(){
		
		 add_interst=(debit_balance+(debit_balance*interset));
	     addinterst=Math.round(add_interst);		 }
	void getbalance()
	{   
	System.out.println("............................................");
	System.out.println("............final output details............");
	    System.out.println("customer_id   :"+cust_id);
		System.out.println("customer_name :"+cust_name);
		System.out.println("balance       :"+balance);
		System.out.println("interset      :"+interset);
        System.out.println("After crediting amount to the costomer account , ur current  balance is"+credit_balance);
        System.out.println("After debiting amount from the costomer account, now ur current balance is"+debit_balance);
        System.out.println("interset amount balance "+addinterst);	
	}
public static void main(String  args[]){
	       
		 
		 Accountsvs svs=new Accountsvs();
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter the amount");
		 int amount =in.nextInt();
		 svs.credit(amount);
		 svs.debit(amount);
		 svs.add_interst();
		 svs.getbalance();
	}
}