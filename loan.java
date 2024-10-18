package loanassign;

public class loan implements loanas{
	 
	 int loan_id,yr;
	 double amount,EMI;
	 public void get(){
		 
		 System.out.println("Enter the loan id :");
		 Scanner input=new Scanner(System.in);
		 loan_id=input.nextInt();
		 System.out.println("Enter the loan amount :");
		 amount=input.nextDouble();
		 System.out.println("enter the no.of.years :");
		 yr=input.nextInt();
		 
	 }
	 public void calc_emi(){
		 
		 EMI=amount/(yr*12);
		 
	 }
	 void display(){
		 System.out.println("Entered loan id : "+loan_id);
		 System.out.println("Entered loan amount : "+amount);
		 System.out.println("Entered  no.of years : "+yr);
		 
	 }
	 
	public static void main(String args[]){
		loan l=new loan();
		l.get();
		l.calc_emi();
		l.display();
	}
	 
	
}