/*Write a Java Program that takes a number as input prints
  its multiplication table up to 10*/
  
import java.util.Scanner;

class multiplication{
  public static void main (String []args)
  {
     	int  num;
       Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter a number for table multiplication:");
	   num = sc.nextInt();
	   
	   for(i=0; i<=10; i++)
	   {
		   System.out.println(num +"*"+i+"="+(num * i));

   	   }
	   
	   
  }
}