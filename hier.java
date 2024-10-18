import java.util.*;
class person{
	String name,gender,n_native;
	int age=0;
   void getdata(){
	   Scanner input=new Scanner(System.in);
	   System.out.println("Name :");
	   name=input.nextLine();
	   Scanner in=new Scanner(System.in);
	   System.out.println("Age :");
	   age=in.nextInt();
	   System.out.println("Gender :");
	   gender=input.nextLine();
	   System.out.println("Native :");
	   n_native=input.nextLine();
	   
   }
   void display(){
	   System.out.println(".............................................");
	  
		   System.out.println("Name :"+name);
		   System.out.println("Age :"+age);
		   System.out.println("Gender :"+gender);
		   System.out.println("Native :"+n_native);
	   }
	
}
class student extends person{
      String institute_name,program;
      int fees=0;
    void getdata_std(){
		Scanner ip=new Scanner(System.in);
       System.out.println("Name of the college:");
	   institute_name=ip.nextLine();
	   System.out.println("Program :");
	   program=ip.nextLine();
	   Scanner it=new Scanner(System.in);
       System.out.println("Fees :");
       fees=it.nextInt();	   
	}	
   void display_std(){
       System.out.println("Name of the college:"+institute_name);
	   System.out.println("Program :"+program);
	   System.out.println("Fees :"+fees);
   }	   
	
}
class staff extends person{
     String department_name,category;
	 int salary;
	 double  salary_hike;
	 void getdata_staff(){
		 Scanner ds=new Scanner(System.in);
		 System.out.println("Department name:");
		 department_name=ds.nextLine();
		 System.out.println("category:");
		 category=ds.nextLine();
		 Scanner sal=new Scanner(System.in);
		 System.out.println("salary:");
		 salary=sal.nextInt();
		 }
		 void incrementhike(){ 
			 
			 if(category=="temporary"){
				 salary_hike=salary*0.1+salary;
				 System.out.println("salary hike : "+salary_hike);
			 }
			 else{
				 salary_hike=salary*0.2+salary;
				 System.out.println("salary hike :"+salary_hike);
			 }
		 }
		 void display_staff(){
			 System.out.println("Department name:"+department_name);
			 System.out.println("category:"+category);
			 System.out.println("salary:"+salary);
		}
	
	
}
class hier {
	public static void main(String args[]){
		   student obj1=new student();
		   staff obj2=new staff();
		   System.out.println("..................................................................");
		   System.out.println("........................Student details...........................");
		   System.out.println("..................................................................");
		   
		   obj1.getdata();
		   obj1.getdata_std();
		   obj1.display();
		   obj1.display_std();
		   System.out.println("...................................................................");
		   System.out.println("........................Staff details..............................");
		   System.out.println("...................................................................");
		   obj2.getdata();
		   obj2.getdata_staff();
		   obj2.display();
		   obj2.display_staff();
		   obj2.incrementhike();
		  
		}
}