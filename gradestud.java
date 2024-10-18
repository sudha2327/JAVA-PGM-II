import java.util.*;
class gradestud{
	int stdno;
	String stdname;
	char Grade;
	int Maths,Physics,Chemistry;
	void read_student(){
		System.out.println("Enter the student id no:");
		Scanner input=new Scanner(System.in);
		std_no=input.nextInt();
		System.out.println("Enter the student name:");
		Scanner namee=new Scanner(System.in);
		std_name=namee.nextLine();
		System.out.println("Enter the Maths Mark:");
		Maths=input.nextInt();
		System.out.println("Enter the Physics Mark;");
		Physics =input.nextInt();
		System.out.println("Enter the Chemistry Mark:");
		Chemistry=input.nextInt();
		
	}
	void display_student(){
		System.out.println("Student details: ");
		System.out.println(" student id no: "+std_no);
		System.out.println(" student name: "+std_name);
		System.out.println(" Entered the Maths Mark: "+Maths);
		System.out.println(" Entered the Physics Mark; "+Physics);
		System.out.println(" Entered the Chemistry Mark: "+Chemistry);
		System.out.println("Grade is "+Grade);	
		
		
		}
	void calculate_grade(){
		
		int average;
		average=(Maths+Physics+Chemistry)/3;
		if(average>=90){
		 Grade='S';
		}
		if(average>=80&&average<90){
			Grade='A';
		}
		if(average>=70&&average<80){
			Grade='B';
		}
		if(average>=60&&average<70){
			Grade='C';
		}
		if(average>=50&&average<60){
			Grade='D';
		}
		if(average<50){
			Grade='F';
		}
	}
}
class MyClass{
	public static void main(String[] args){
        gradestud g=new gradestud();
        g.read_student();
        g.calculate_grade();
        g.display_student();
        	
	  
	}
}