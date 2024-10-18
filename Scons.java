public class Scons{
	private String name;
	public String setname(){
		return name;
	}
	public void setname(String n){
		this.name=n;
	}
}
class MyClass{
	public static void main(String[] args){
		Scons s=new Scons();
		s.setname("sudhagr");
		System.out.println("your given name is:"+s.setname());
	}
}