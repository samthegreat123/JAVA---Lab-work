/*wirte a java program to swap two varibles with and 
   without temp*/
   import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

     
        int x = a;
        int y = b;

        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping using temp variable:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        a = x;
        b = y;


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter swapping without temp variable:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        sc.close();
    }
}