class Animale{
	protected int legs;
	public void eat(){
		System.out.println("Animal");
	}
}
class Dog extends Animale{
	
	Dog(){
		int leg=5;
	}
	
}
class MyClass{
	public static void main(String[] args){
		Dog d=new Dog();
		d.eat();
	}
	
}