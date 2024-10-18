import java.util.Scanner;
class furniture{
       int  height,width;
	   Scanner input=new Scanner(System.in);
  void getvalues(){
	   int height,width,n_shelf;
	   String color;
	   System.out.println("Enter the height : ");
	   height=input.nextInt();
	   System.out.println("Enter the width :  ");
	   width=input.nextInt();
	   
	   
   }
  
}
public class shelf extends furniture{
	  
	public  int n_shelf;
	 public double cost,sq_meter;
	 public String color;
	
	 public void get(){
	 
	   System.out.println("Enter the color of the shelf: ");
	   color=input.next();
	   System.out.println("no.of the shelf : ");
	   n_shelf=input.nextInt();
	 }
    public  void calculate_sq_meter(){
		sq_meter=height*width;
		System.out.println("sq_meter"+ sq_meter);
	        switch(color){
			 case"red":
				cost=200*+(n_shelf*sq_meter);
				break;
				
			case "blue":
				cost=300+(n_shelf*sq_meter);
				break;
			
			case "white" :
				cost=500+(n_shelf*sq_meter);
				break;
				
			case "black":
				cost=900+(n_shelf*sq_meter);
				break;
			}
			System.out.println("total cost"+cost);
		}
		public void display2(){
		
		System.out.println("Enterd color  :"+color);
        System.out.println("Enterd no. of shelf : "+n_shelf);
        System.out.println("The cost of the shelf is : "+cost);		
	}
	

public static void main(String[] args){
		shelf s=new shelf();
		s.getvalues();
		s.get();
		s.calculate_sq_meter();
		
		
		s.display2();

		
	}
	
}
