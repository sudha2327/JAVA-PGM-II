import java.util.*;
interface pattern{
	
	void menu();
	
}
class author{
	
	String author_name,publish_year,book_title;
}
class book extends author{
	
	 book(String n,y,b){
		 author_name=n;
		 publish_year=y;
		 book_title=b;
		 
		 
	 }
	
	void get(){
		
	}
	void display(){
		
		System.out.println("author name"+author_name);
		
	}
	
}
class article extends author{
	
	void get(){
		
		
	}
	void display(){
		
		
	}
}

class Myclass {
	
	public static void main(String args[])
	{     int n;
		  System.out.println("enter the no of the book details you wants to share in this pgms:");
		  Scanner nn=new Scanner(System.in);
		  n=nn.nextInt();
		  book[] obj1=new book[n];
		  for(i=0;i<n;i++){
			   
			   a=nn.nextLine();
			   b=nn.nextLine();
			   c=nn.nextLine();
			   book[i] obj1=new book(a,b,c);
			   
			  
		  }
		  for(i=0;i<n;i++){
			  obj[i]=display();
		  }
		  
		
	}
	
}