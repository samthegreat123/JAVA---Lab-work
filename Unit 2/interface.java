/* Write a java program to use interface in Java*/

interface Animal
{
   public void eat();
}

class Dog implements Animal
{
    public void eat()
    {
       System.out.println("The Dog is eating bone!");
    }

    void sound(){
      System.out.println("it makes a sound like, woff woff1!");
    }
}

public class interface
{
   public static void main(String[]args)
   {
      Dog mydog = new Dog();

      System.out.println("Dog:");
      mydog.eat();
      mydog.sound();
   }
}