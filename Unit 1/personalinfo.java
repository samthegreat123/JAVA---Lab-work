/*3.      
Write a java program to get personal information from user and display 
on screen.*/


import java.util.Scanner;

class personalinfo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
   //get name
  System.out.print("Enter your name:");
  String name = sc.nextLine();
  
  System.out.println(name);
  
  //get age
  System.out.print("Enter your age:");
  int age = sc.nextInt();
  
  sc.nextLine(); 
  
  System.out.println(age);
  
  //get gender
   System.out.print("Your gender:");
   String gender = sc.nextLine();
   
   System.out.println(gender);
   
   System.out.println(name);
   System.out.println(age);
   System.out.println(gender);
   
  }
  
}