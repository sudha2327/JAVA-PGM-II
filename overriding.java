class overridding{
	public void hello(){
		System.out.println("hii this sudhagar....");
	}
	
}
class hiii extends overridding{
      public void hello(){
		  System.out.println("hii this overridding sentences");
	  }
	
}
class MyClass{
	public static void main(String args[]){
		hiii j=new hiii();
		j.hello();
	}
}