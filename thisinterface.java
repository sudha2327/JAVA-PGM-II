interface thisinterface{
	public void ead();
	public void has();
}
class hello implements thisinterface{
	public void ead(){
		System.out.println("hii thus sudhagar");
		
	}
	public void has(){
	System.out.println("hii thiod for seconf one");
}
}
 class Myclass{
	public static void main(String[] args){
		hello v=new hello();
		v.ead();
		v.has();
	}
}

