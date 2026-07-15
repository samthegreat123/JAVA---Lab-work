/*.   
9.   
Write  a  java  program  to  find  ODD  or  EVEN  number  using  
command  line argument */

class OddEven {

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }
}