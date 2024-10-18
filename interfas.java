import java.util.Scanner;
interface employee{
	void get_name();
	void check_unique();
}
class interfas implements employee{
	public void get_name(){
		String e_name;
		int n;
		Scanner input=new Scanner(System.in);
		Sysetem.out.println("Enter the number of str u want:");
	String[] e_name=new String [input.nextint()];
	input.nextLine();
	for (int i=0;i<e_name.length;i++){
	e_name[i]=input.nextLine();	
	}
	for(String name:e_name){
		System.out.println(name);
	}
		
	}
	public static void main(String args[]){
		interfas a=new interfas();
		a.get_name();
		
	}
}