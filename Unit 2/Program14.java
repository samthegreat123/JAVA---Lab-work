/* 14. Multilevel Inheritance example*/

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

  class Poppy extends Dog{
    void weep(){
        System.out.println("The Pups Weeps!");
    }
  }

    public class Program14{
        public static void main(String[] Args)
        {
            Poppy mypups = new Poppy();
            mypups.eat();
            mypups.bark();
            mypups.weep();
        }
    }


