package newproject;
import java.util.*;
public class Prog1 {
public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
String name = sc.nextLine();
System.out.println("Enter your age:");
int age = sc.nextInt();
System.out.println("Enter your address:");
String address = sc.nextLine();
System.out.println("Your name is: " + name);
System.out.println("Your age is: " + age);
System.out.println("Your address is: " + address);
System.out.println("Welcome " + name + " to our program");
sc.close();
}
}