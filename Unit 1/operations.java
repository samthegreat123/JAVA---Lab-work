/*4
Write  a  java  program  to  perform  different  arithmetic  operations.  
(Using 
Command Line args)*/

class Operations {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperations <num1> <num2>");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + (a / b));
            System.out.println("Modulus = " + (a % b));
        } else {
            System.out.println("Division and Modulus cannot be performed (division by zero).");
        }
    }
}