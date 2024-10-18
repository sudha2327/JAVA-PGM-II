public class Kotlin{
        private String  name;
		private int roll_number;
		public String  getname(){
			return name;
			
		}
		public int getroll_number(){
			return roll_number;
		}
		public  void setname(String n){
			this.name=n;
		}
		public  void setroll_number(int r){
			this.roll_number=r;
		}
}
class MyClass{
	public static void main(String[] args){
		Kotlin obj=new Kotlin();
		obj.setname("sudhagar");
		obj.setroll_number(1907051);
		System.out.println(obj.getname());
		System.out.println(obj.getroll_number());
		
	}
	
}