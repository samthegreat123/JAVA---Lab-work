/* Inheritance example*/

class Animal{
     String name ="Animal";
     void eat(){
       System.out.println("This Animal eats food.");
     }
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks: Wolf! Wolf!");
    }
}

    public class Program13{
        public static void main(String[] Args)
        {
            Dog mydog = new Dog();
            mydog.eat();
            mydog.bark();

        }
    }