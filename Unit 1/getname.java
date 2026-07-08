/*Write a java program to get a name from user and display on screen. */
  import java.util.Scanner;

class getname {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = sc.nextLine();

        System.out.println("Hello " + name);
    }
}
		