import java.util.*;
 class emply{
	 int empno;
	 int cross_salary;
	 int basic_salary;
	String empname;
	 void read_val(){
		 Scanner input=new Scanner(System.in);
		 System.out.println("enter the emply_id:");
		 empno=input.nextInt();
		 Scanner namee=new Scanner(System.in);
		 System.out.println("enter the name:");
		 String empname=namee.nextLine();
		 System.out.println("Enter the emply salary:");
		
		 basic_salary=input.nextInt();
		}
		void disply(){
		System.out.println("Employer id:"+empno);
		System.out.println("Employer name:"+empname);
		System.out.println("Employer salary:"+basic_salary);
		
	}
		
	void cross_val(){
		int cross_salary;
		cross_salary=basic_salary+(basic_salary*10/100)+(basic_salary*25/100);
		System.out.println("Employer cross_salary:"+cross_salary);
	}
	
	
	
}
class MyClass{
	 public  static void main(String[] args){
		 emply obj=new emply();
		 obj.read_val();
		 obj.disply();
		 obj.cross_val();
		 
	 }
	
}