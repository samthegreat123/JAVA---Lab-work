/*5.   
Write a java program to get different values from user at runtime using 
Scanner.*/

import java.util.Scanner;

class getvalue
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number:");
	int intnum = sc.nextInt();
	
	

System.out.print("Enter a decimal number:");
	double dec = sc.nextDouble();
	
	System.out.print("Enter a name:");
	String name = sc.nextLine();
	

	System.out.println("You Entered:");
	 System.out.println("Integer: " + intnum);
     System.out.println("Double: " + dec);
     System.out.println("String: " + name);
	
	}
}	