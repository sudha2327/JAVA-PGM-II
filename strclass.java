public class strclass{
	private String  name;
	private int age;
	strclass(String n){
		this.name=n;
	}
	public int  getage(){
		return age;
	}
	public void setage(int a){
		this.age=a;
	}
}
class Mine{
	public static void main(String[] args){
		strclass k;
		k=new strclass("sudhagr");
		k.setage(20);
		celebratingbday(k);
		System.out.println(k.getage());
	}
	static void celebratingbday(strclass p){
		p.setage(p.getage()+2);
	}
}

