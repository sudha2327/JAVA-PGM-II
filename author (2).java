import java.util.*;
interface pattern{
	
	void menu();
	
}
public class author {
	
	String book_author_name,book_publish_year,book_title,article_title,article_author_name,article_publish_year;
	int ch;
	
	public void menu(){
		
		System.out.println("1----> Author publishes both articles and book in the same year");
		System.out.println("2----> Articles and book details of the given author ");
		System.out.println("enter the choice u wants: ");
	Scanner input=new Scanner(System.in);
	ch=input.nextInt();
		
		switch(ch){
			
			case 1:
			       System.out.println("You have choosen first choice..");
				   if(article_publish_year==book_publish_year){
					    System.out.println(article_author_name);
						System.out.println(book_author_name);
						break;
				   }
				   
		}
		
	}
	
}
class book extends author{
	
	 book(String n,String y,String b){
		 book_author_name=n;
		 book_publish_year=y;
		 book_title=b;
		 
		 
	 }
	
	
	void display(){
		
		System.out.println("author name  "+book_author_name+"  year"+book_publish_year + "   boks  "+book_title);
		
	}
	
}
class article extends author{
	 article(String c,String v,String h){
		article_author_name=c;
        article_publish_year=v;
        article_title=h;		
	 }
	
	void get(){
		
		
	}
	void display(){
		
		
		System.out.println("author name  "+article_author_name+"  year"+article_publish_year + "   boks  "+article_title);
		
	}
	void perform(){
		
	
	}

}

class Myclass {
	
	public static void main(String args[])
	{     int n,i,m;
	String a,b,c,v;
		  System.out.println("enter the no of the book details you wants to share in this pgms:");
		  Scanner nn=new Scanner(System.in);
		  n=nn.nextInt();
		  
		  book[] obj1=new book[n];
		  
		  
		  for(i=0;i<n;i++){
			   System.out.println("enter the author");
			   a=nn.next();
			   System.out.println("enter the year:");
			   b=nn.next();
			   System.out.println("enter the book name");
			   c=nn.nextLine();
			   c=nn.nextLine();
			   obj1[i]=new book(a,b,c);
			   
			  
		  }
		  for(i=0;i<n;i++){
			  obj1[i].display();
		  }
		  System.out.println("enter the no.of the article you wants to store:");
		  m=nn.nextInt();
		  article[] obj2=new article[m];
		  for(i=0;i<m;i++){
			   System.out.println("enter the author");
			   a=nn.next();
			   System.out.println("enter the year:");
			   b=nn.next();
			   System.out.println("enter the book name");
			   c=nn.nextLine();
			   v=nn.nextLine();
			   obj2[i]=new article(a,b,v);
			   
			  
		  }
		  for(i=0;i<m;i++){
			  obj2[i].display();
		  }
		  
		  author au=new author();
		  au.menu();
		  
		  
		  
		
	}
	
}