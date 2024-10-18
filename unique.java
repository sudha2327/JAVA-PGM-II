import java.util.*;
interface Employee{
void get_details();
void perform();
void display();
}
public class Office implements Employee{
public int n,i,j;
public String name[]=new String[10];
public void get_details(){
Scanner inp=new Scanner(System.in);
System.out.println("Enter the no.of.Employees:");
n=inp.nextInt();
System.out.println("Enter the name of the Employees:");
for(i=0;i<n;i++){
name[i]=inp.next();
name[i]=name[i].toLowerCase();
}
}
public void perform(){
for(i=0;i<n;i++){
for(j=0;j<i;j++){
if(name[i].equals(name[j])){
name[i]="null";
name[j]="null";
}
}
}
}
public void display(){
System.out.println("Unique Names:");
for(i=0;i<n;i++){
if(name[i]!="null"){
System.out.println(name[i]);
}
}
}
public static void main(String[] args){
Office o=new Office();
o.get_details();
o.perform();
o.display();
}
}