/*19. Multiple Inheritance using Interfaces */

interface Cycle {
    void sound();
}

interface Bike extends Cycle {
    void speed();
}

class Car implements Bike {

    public void sound() {
        System.out.println("Brooom, Brooom!");
    }

    public void speed() {
        System.out.println("3.5 km/h");
    }
}

public class multiple {
    public static void main(String[] args) {

        Car mycar = new Car();

        System.out.println("This car has:");
        mycar.sound();
        mycar.speed();
    }
}