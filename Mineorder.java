import java.util.*;
 class Mineorder{
	String name(){
	System.out.println("enter the product items:");
	Scanner input=new Scanner(System.in);
	String n=input.nextLine();
	return n;
	}

   int price(){
	   System.out.println("enter teh price of the product item:");
	   Scanner prices=new Scanner(System.in);
	   int z=prices.nextInt();
	   return z;
   }
   int  type(){
	   System.out.println("what kind of order u want");
	   System.out.println("1.Normal or 2.Speical");
	   Scanner types=new Scanner(System.in);
	   int  T=types.nextInt();
	   return T;
	   
   }
 }
class yourOrder{
	public static void main(String[] args)
	{  
        System.out.println("enter your choice u wanna make order :");
		System.out.println("1-order 2-not interseted to make order");
		int ch;
		Scanner inputs=new Scanner(System.in);
		ch=inputs.nextInt();
		System.out.println("you have choosen "+ch);	
		
		do{
		    Mineorder obj=new Mineorder();
            String S =obj.name();
			int P =obj.price();
			int e=obj.type();
			if(e==1){
				Normal w=new Normal();
				w.display(S,P);
			}
			if(e==2){
				Speical h=new Speical();
                h.display(S,P);                     
					 }
					 
		
		}while(ch==1);
	}
            			
		}
	
class Speical extends Mineorder{
	void display(String S,int P)
	{
		System.out.println("your orders details:");
		System.out.println("product name:"+ S);
		System.out.println("your Product price is"+" "+ P);
		System.out.println("your orders is Special");
		System.out.println("Give the location:");
		Scanner loci=new Scanner(System.in);
		String l=loci.nextLine();
		System.out.println("Your given location is "+l);
		System.out.println("you have some offer for choosen this way of order:");
		System.out.println("you can cancle it within 10 days after delivery");
	}
}
class Normal extends Mineorder{
	void display(String S,int P)
	{
		System.out.println("your orders details:");
		System.out.println("product name:"+ S);
		System.out.println("your Product price is"+" "+ P);
		System.out.println("your orders is Special");
		System.out.println("Give the location:");
		Scanner locie=new Scanner(System.in);
		String o=locie.nextLine();
		System.out.println("Your given location is "+o);
	}
}

