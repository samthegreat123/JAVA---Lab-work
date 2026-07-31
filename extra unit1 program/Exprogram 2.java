/*Write a java program to print the area and perimeter of 
   rectangle and circle*/
    
 import java.util.Scanner;
 class math{
	 public static void main(String[]args)
	 {
		 Scanner sc = new Scanner(System.in);
		 int area, perimeter,pi=22/7;
		 int width, length,breadth,radius;
		 
		 //For a Rectangle...
		 System.out.println("Enter the length:");
		 width = sc.nextInt();
		 
		 System.out.println("Enter the width:");
		 length = sc.nextInt();
		 
		  System.out.println("Enter the breadth:");
		 breadth = sc.nextInt();
		 
		 area = width * length;
		 perimeter = 2*(width+breadth);
		 
		 System.out.println("area of rectangle is :" + area);
		 System.out.println("perimeter of rectangle is :" + perimeter);
		 
	   //For circle...
		 
		 System.out.println("Enter the radius:");
		 radius = sc.nextInt();
		
		 
		 area = pi*radius*radius;
		 perimeter = 2*pi*radius;
		 
		 System.out.println("area of circle is :" + area);
		 System.out.println("perimter of circle is:"+perimeter);
	 }
	 
 }