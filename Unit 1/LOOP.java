/*6.   
Write a java program to get the name from user and print 10 times using 
loop*/

import java.util.Scanner;

 class loopname
 {
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter your name:");
		 String name = sc.nextLine();
		  int i;
	
	     
		 for(i=0; i<=5; i++){
		     System.out.println( name);
		 }
		 
	 }
	 
 }	