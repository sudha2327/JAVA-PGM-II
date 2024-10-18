class goof
{
	public void sound(){
		System.out.println("hiiii......this sudhagar");
	}
}
class cat extends goof{
	public void sound(){
		System.out.println("meowwwwww");
	}
}
class fag extends goof{
	public void sound(){
		System.out.println("wooffff");
	}
}
class MyClass{
public static void main(String args[]){
	goof d=new cat();
	goof b=new fag();
	d.sound();
	b.sound();
  }
}
