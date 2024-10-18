class A{
	public A(){
		System.out.println("this for mine first super classes function:");
		
	}
}
class B extends A{
	public B(){
		System.out.println("this for mine secondcalss:");
	}
}
class MyClass{
	public static void main(String[] args){
		B obj=new B();
	}
}