//Method Overloading....
class MethodOverloading {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }


public class Main {

    public static void main(String[] args) {

        Methodoverloading c = new MethodingOverloading();

        c.add(10, 20);
        c.add(10, 20, 30);
   
    }
}