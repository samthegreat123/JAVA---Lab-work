/*Write a Java program to get a number from the user
  and print whether it is positive or negative*/
  
  import java.util.Scanner;
  class check{
	  public static void main(String[] args)
	  {
		  Scanner sc = new Scanner(System.in);
		  
		  int num;
		  
		  System.out.println("Enter a number:");
		  num = sc.nextInt();
		  
		  if(num>=0){
			  System.out.println("Positve");
		  }
		    else{
				System.out.println("Negative");
			}
			
	  }
	  
  }