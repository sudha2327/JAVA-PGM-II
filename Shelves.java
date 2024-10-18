import java.util.*;
class Furniture{
int height,width;
String color;
Scanner inp=new Scanner(System.in);

void getdetails(){
System.out.println("Enter the Height:");
height=inp.nextInt();
System.out.println("Enter the Width:");
width=inp.nextInt();
System.out.println("Enter the Colour:");

color=inp.next();
}
}
public class Shelves extends Furniture{
public int no;
public float cost,area;

public void getdetail(){
System.out.println("Enter the No.of.Shelves:");
no=inp.nextInt();
}

public void amount(){
area=height*width;
System.out.println("Cost per sq.meter: Rs.52");
cost=area*52;
System.out.println("Cost for 1 shelf of "+area+" sq.meter: "+cost);
cost=cost*no;
System.out.println("Cost for making "+no+" shelves: "+cost);
switch(color){
case "blue":
System.out.println("Cost of Paint: Rs.24 per sq.meter");
cost=cost+no*area*24;
break;
case "green":

System.out.println("Cost of Paint: Rs.18 per sq.meter");
cost=cost+no*area*18;
break;
case "red":
System.out.println("Cost of Paint: Rs.35 per sq.meter");
cost=cost+no*area*35;
break;
}
System.out.println("Total Cost: Rs."+cost);
}

public static void main(String[] args){
Shelves sl=new Shelves();
sl.getdetails();
sl.getdetail();
sl.amount();
}
}