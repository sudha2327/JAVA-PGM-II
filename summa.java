import java.util.*;
class Accountsvs{
	 int cust_id;
	 String cust_name;
	 int balance;
	 int  interset;
	 int addinterst;
	 int credit_balance;
	  int debit_balance;
	 Accountsvs(){
	 System.out.println("enter the costomer id :");
	 Scanner input=new Scanner(System.in);
	 cust_id=input.nextInt();
	 Scanner inp=new Scanner(System.in);
	 System.out.println("enter the costomer name:");
	 cust_name=inp.nextLine();
	 System.out.println("enter the balance:");
	 balance=input.nextInt();
	 System.out.println("enter the interset:");
     interset=input.nextInt();
	 }
     void credit(int amount){
		 
        credit_balance=balance+amount;
		
	 }		 
	 void debit(int amount){
		
	     debit_balance=balance-amount;
		
	 }
	 void  addinterst(){
		 
		 addinterst=debit_balance+(debit_balance*interset);
		 }
	void getbalance()
	{   
	    System.out.println("costomer_id   :"+cust_id);
		System.out.println("costomer_name :"+cust_name);
		System.out.println("balance       :"+balance);
		System.out.println("interset      :"+interset);
        System.out.println("After crediting amount to  the costomer account, now ur current balance is"+credit_balance);
        System.out.println("After debiting amount from the costomer account, now ur current balance is"+debit_balance);
        System.out.println("interset amount "+addinterst);	
	}
}
class MyClass{
public static void main(String[]  args){
		 int amount;
		 Scanner inputt=new Scanner(System.in);
		 amount=inputt.nextInt();
		 Accountsvs svs=new Accountsvs();
		 svs.credit(amount);
		 svs.debit(amount);
		 svs.addinterst();
		 svs.getbalance();
	}
}