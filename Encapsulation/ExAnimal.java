/*Assignment 2: Method Overriding
Create a base class called Animal with a method make_sound that prints a generic sound made by an animal. Create two derived classes, Dog and Cat, that override the make_sound method to print "Woof" and "Meow" respectively.*/
class Animal
  {
    void make_sound()
    {
      System.out.println("Different animals make different sounds");
    }
  }
class Dog extends Animal
  {
    void make_sound()
    {
      System.out.println("Dog makes sound like Woof");
    }
  }
class Cat extends Animal
  {
    void make_sound()
    {
      System.out.println("Cat makes sound like meow");
    }
  }
class ExAnimal
  {
    public static void main(String args[])
    {
      Animal a=new Animal();
      a.make_sound();
      Animal dog=new Dog();
      dog.make_sound();
      Animal cat=new Cat();
      cat.make_sound();
    }
  }