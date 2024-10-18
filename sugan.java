import java.util.ArrayList;
import java.util.List;
public class sugan{
	  public static void getlist(List<Integer>list){
		  
		  System.out.println("array list"+list);
		  if(list!=null && !list.isEmpty()){
			  
			  System.out.println("last element is"+list.get(list.size()-1));
			  return ;
		  }
	  }
	  public static void main(String [] args)
	  {
		  List<String>al=new ArrayList<String>();
		  al.add("sudhagar","5000");
		  al.add("sugan","60000");
		  al.add("hiiii","797689");
		  al.add("hiiee","86878");
		  al.add("giii","970789");
		  getlist(al);
	  }
}