import java.util.*;
 public class statice{
	public static int COUNT=0;
	statice(){
		COUNT++;

	}
	
 }
class MyClasse{
	public static void main(String[] args){
		statice s1=new statice();
		statice s2=new statice();
		statice s3=new statice();
		System.out.println(statice.COUNT);
		}
	
	
}