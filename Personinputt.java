import java.util.*;
public class Personinputt{
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
   Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");
// String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    Personinputt myObj1 = new Personinputt();
    System.out.println("Name: " + myObj1.fname + " " + myObj1.lname);
    System.out.println("Age: " + myObj1.age);
System.out.println("Name: " + name);
    System.out.println("Age: " + age);
System.out.println("salary: " + salary);
  }
}