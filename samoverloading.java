public class samoverloading{
	class A{
	public void doSomething(){
		System.out.println("A");
        
		}
		public void doSomething(String str){
			System.out.println(str);
		}
	}

class B{
	public static void main(String[] args){
		A obj=new A();
		obj.doSomething("B");
	}
  }
 }