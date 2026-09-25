//A simple program to implement Simple Exception handling..

public class Main{
  public static void main(String[]args)
     {
        try{
             int number = 10/0;
             System.out.println(number);

        }

        catch(Exception e)
        {
           System.out.println("An Expections occured..");
        }

        System.out.println("Program continues...");
     }
}