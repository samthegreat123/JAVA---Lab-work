/*Write to accept a number and check wheather the number is even
  or odd. prints 0 if number is odd else 1 if number is.*/
  
  import java.util.Scanner;
  
  class number
  {
	  public static void main(String[]args)
	  {
		  Scanner sc = new Scanner(System.in);
		  
		  int num;
		  
		  System.out.println("Enter any number:");
		  num = sc.nextInt();
		  
		  if(num%2==0)
		  {
			  System.out.println("Even: 1");
		  }else
		  {
			  System.out.println("Odd: 0");
		  }
	  }
  }