public class Vehicle{
	private String colr;
	//seter\df
	public String getcolr(){
		return colr;
	}
	public void setcolr(String c){
		this.colr=c;
	}
	
}
class Program{
 public static void main(String[] args){
	 Vehicle v1=new Vehicle();
	 v1.setcolr("eeeeee");
	 System.out.println(v1.getcolr());
	 
 }

}