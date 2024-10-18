import java.util.ArrayList;
public class objcons{
        int customer_id;
		String customer_name;
		int salary;
		objcons(int i,String n,int s)
		{
			customer_id=i;
			customer_name=n;
			salary=s;
		}
		void display(){
			System.out.println("customer_id:"+customer_id);
			System.out.println("customer_name:"+customer_name);
			System.out.println("salary:"+salary);
		}

}

class MyClass{
	public static void main(String[]  args){
		objcons[] obj=new objcons[3];
		obj[0]=new objcons(1907080,"sudhakutty svs",50000);
		obj[1]=new objcons(1907050,"siddharth svs",80000);
		obj[2]=new objcons(1907051,"sudhagar svs",60000);
		obj[0].display();
		obj[1].display();
		obj[2].display();
		System.out.println(obj);
	}
}