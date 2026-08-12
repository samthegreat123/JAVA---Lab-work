//15. Write a java program to use Hierarchical inheritance..

class Animal{
	void eats(){
		System.out.println("This Animal is eating..");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("This Dog barks,Worf Worf!");
	}
}

class Cat extends Animal{
	void meow(){
		System.out.println("The cats cry, meow");
	}
}
  public class Main{
	  
public static void main(String[]args)
{
	   Dog dog = new Dog();
        dog.eats();
        dog.bark();

        Cat cat = new Cat();
        cat.eats();
        cat.meow();
}

  }