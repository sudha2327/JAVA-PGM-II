import java.util.Scanner;
class invalidAgeandWeight extends Exception{
	
}
class police{
	int age;
	float weight;
	String name;
	Scanner input=new Scanner(System.in);
	
	void get_details(){
		
		System.out.println("Enter the candidate name : ");
		name=input.nextLine();
		System.out.println("Enter the candidate age : ");
		age=input.nextInt();
		System.out.println("Enter the candidate weight :");
		weight=input.nextFloat();
	}
	void eligible(){
		 try{
			 
			 if(age<18 && weight <55.00){
				 throw new invalidAgeandWeight();
		    	 }
				 else{
					 System.out.println(name+"  you are selcted for police next level exam");
				 }
		 }
		 catch(Exception a){
					 System.out.println(name+"  you are not selcted for police exam...");
				 }
	} 
	public static void main(String[] args){
		police p=new police();
		p.get_details();
		p.eligible();
		
	}

}