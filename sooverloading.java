public class sooverloading{
	  static int sudhagr(int a,int b){
		 if(a>b){
			 return a;
		 }
		 else{
			 return b;
		 }
	 }
	

   static double sudhagr(double a,double b){
	if(a<b){
	   return a;	
	}
	else{
		return b;
	}
	
}
public static void main(String[] args){
	System.out.println(sudhagr(10,10));
	System.out.println(sudhagr(34.19,6.71));
}
}
