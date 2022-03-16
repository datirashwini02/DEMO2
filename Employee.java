package pack1;
import java.util.*;
import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		String name;
		int age;
	    float salary;
	


		 
		  Scanner r = new Scanner(System.in);

		  System.out.print("Enter the name :: ");
		  name = r.next();
		  System.out.print("Enter the age :: ");
		  age = r.nextInt();
		  System.out.print("Enter the salary :: ");
		  salary = r.nextFloat();
		 }
		 
		 public void display() {
		  
		  System.out.println("Employee name = " + name);
		  System.out.println("Employee age = " + age);
		  System.out.println("Employee salary = " + salary);
		 }

	    }
