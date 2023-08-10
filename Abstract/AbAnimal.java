/*Assignment 3: Animal Hierarchy
Create an abstract class called "Animal" with the following abstract methods:
speak(): Outputs the sound that the animal makes.
move(): Describes how the animal moves.
Create concrete classes Dog, Cat, and Bird that inherit from the abstract class "Animal." Implement the required methods for each class.
Write a program to:
Create instances of Dog, Cat, and Bird.
Display the sound and movement of each animal.*/
abstract class Animal
  {
    abstract void speak();
    abstract void move();
  }
class Dog extends Animal
  {
      public void speak()
    {
      System.out.println("Dog sounds like bow bow");
    }
    public void move()
    {
      System.out.println("Dog walks like zig zag");
    }
  }
class Cat extends Animal
  {
      public void speak()
    {
      System.out.println("Cat sounds like meow meow");
    }
    public void move()
    {
      System.out.println("cat walks like running");
    }
  }
class Bird extends Animal
  {
    public void speak()
    {
      System.out.println("Bird sound is different from animal sounds");
    }
    public void move()
    {
      System.out.println("Bird cannot walk its fly");
    }
  }
  class AbAnimal
    {
      public static void main(String args[])
      {
        Animal d=new Dog();
        Animal b=new Bird();
        Animal c=new Cat();
        d.speak();
        d.move();
        c.speak();
        c.move();
        b.speak();
        b.move();
      }
    }
