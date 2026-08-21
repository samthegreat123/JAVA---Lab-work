/*20. Write a java program to perform overriding of abstract class*/

abstract class Animal
{
	//abstract method(this method does not have a method).
	public abstract void animalsound();
	
	void sleep()
	{
		System.out.println("Zzzzzzzzz");
	}
	
}
   class Dog extends Animal
   {
	   public void animalsound()
	   {
		   System.out.println("The Dog says: word..Worf");
		   
	   }
	   
   }
   
   class Abs
   {
	   public static void main(String[]args)
	   {
		   Dog myDog = new Dog();
		   
		   myDog.animalsound();
		   myDog.sleep();
	   }
	   
   }
