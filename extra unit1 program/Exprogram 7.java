/*Write a Java Program that takes three numbers from the user
 and prints the smaller and bigger number.
 import java.util.Scanner;*/

public class SmallBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int smallest, largest;

        // Find smallest
        if (a <= b && a <= c)
            smallest = a;
        else if (b <= a && b <= c)
            smallest = b;
        else
            smallest = c;

        // Find largest
        if (a >= b && a >= c)
            largest = a;
        else if (b >= a && b >= c)
            largest = b;
        else
            largest = c;

       
        System.out.println("Smallest Number = " + smallest);
        System.out.println("Largest Number = " + largest);

        sc.close();
    }
}