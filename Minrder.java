
import java.util.*;

class Mineorder{
	String Name;
	int price;
	Mineorder(String a,int b){
		Name = a;
		price = b;
	}
	void display(){
		System.out.println("Order Name is "+Name);
	}
	void deliver() {
		System.out.println("This order is a Normal order");
	}
	void track() {
		System.out.println("Your order is in  Triumagalam");
	}
}
class SpecialOrder extends Mineorder{
	SpecialOrder(String a,int b){
		super(a,b);
	}
	void deliver() {
		System.out.println("The order should be delivered within 10 days");
	}
    void track() {
    	System.out.println("Your order is at Madurai");
    }
}
