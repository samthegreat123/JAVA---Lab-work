/*12.A program that extends one interface into another interface*/
interface Animal {
    void makesound();
    void eat();
}

// Dog class implementing the Animal interface
class Dog implements Animal {

    public void makesound() {
        System.out.println("Woof!");
    }

    public void eat() {
        System.out.println("Dog is eating dog food.");
    }
}

// Cat class implementing the Animal interface
class Cat implements Animal {

    public void makesound() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Cat is eating cat food.");
    }
}

// Main class
class interfaceEx {

    public static void main(String[] args) {

        
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("Dog:");
        dog.makesound();
        dog.eat();

        System.out.println("\nCat:");
        cat.makesound();
        cat.eat();
    }
}