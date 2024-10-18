import java.util.*;


class Shape{
	int parameter;
	Shape(int a){
		parameter = a;
	}
	double area() {
		return 1;
	}
	double circumference() {
		return 0;
	}
}
class Square extends Shape{
	Square(int a){
	super(a);
	}
	double area() {
		return parameter*parameter;
	}
	double circumference(){
		return 4*parameter;
	}
}
class Round extends Shape{
	Round(int a){
	super(a);
	}
	double area() {
		return 3.14*parameter*parameter;
	}
	double circumference(){
		return 2*3.14*parameter;
	}
}
class Sphere extends Shape{
	Sphere(int a){
	super(a);
	}
	double area() {
		return 3.14*parameter*parameter*4;
	}
	double circumference(){
		return (4/3)*(3.14*parameter*parameter*parameter);
	}
}
class NumberTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Shape s;
		System.out.println("Enter choice 1:Round 2:Square 3:Sphere");
		int ch ;
		ch = sc.nextInt();
		int val;
		System.out.println("Enter the value");
		val = sc.nextInt();
		switch(ch) 
		{
		case 1:{
			s = new Round(val) ;
			System.out.println("The area is " +s.area());
			System.out.println("The circumference is "+s.circumference());
			break;
		}
		case 2:
		{
			s = new Square(val) ;
			System.out.println("The area is "+s.area());
		    System.out.println("The length of the diagonal is "+s.circumference());
		    break;
		}
		case 3:
		{
			s = new Sphere(val) ;
			System.out.println("The surface area of sphere"+s.area());
			System.out.println("The volume of sphere"+s.circumference());
			break;
		}
		default :{
			System.out.println("Enter the correct  choice");
			break;
		}
		
		}
	}
}
