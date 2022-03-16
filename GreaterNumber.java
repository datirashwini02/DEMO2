package pack1;

import java.util.*;
import java.util.Scanner;
public class GreaterNumber {

	public static void main(String[] args) {
		

		
		
		Scanner result = new Scanner(System.in);
			
				int number1, number2, greater;
				result= new Scanner(System.in);
				
				System.out.print(" Please Enter the First Number : ");
				number1 = result.nextInt();	
				
				System.out.print(" Please Enter the Second Number : ");
				number2 = result.nextInt();	
				
				 greater = (number1 > number2)? number1: number2;
				System.out.println("\n The Greater Number = " + greater);   
				}
			}	
	


