/*7.   
Write a java program to use IF Condition */
import java.util.Scanner;
class condition{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number from(1-3):");
        int number = sc.nextInt();
        
        if(number == 1){
            System.out.println("Good morning!");
        }else if(number==2){
            System.out.println("Good Day!");
        }else if(number == 3){
            System.out.println("Good night!");
        }else{
            System.out.println("Invalid input!");
        }
    }
}