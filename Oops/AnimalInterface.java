/*Animal Interface Create an interface called Animal with the following methods:
sound(): Abstract method that returns a String representing the sound the animal makes.
eat(String food): Abstract method that takes a String parameter food representing the food the animal eats.
Now, create classes Dog, Cat, and Duck, implementing the Animal interface. Write appropriate code for each animal's sound and eating habits.*/
interface Animal
  {
    public void sound(String make);
    public void food(String eat);
  }
class Dog implements Animal
  {
    public void sound(String make)
    {
      System.out.println("the dog sounds as "+make);
    }
    public void food(String eat)
    {
      System.out.println("dog eats "+eat);
    }
  }
class Cat implements Animal
  {
    public void sound(String make)
      {
      System.out.println("the cat sounds as "+make);
      }
    public void food(String eat)
      {
      System.out.println("the cat feeds with "+eat);
      }
  }
class Duck implements Animal
{
  public void sound(String make)
  {
    System.out.println("the duck sounds as "+make);
  }
  public void food(String eat)
  {
    System.out.println("the duck feeds with "+eat);
  }
}
class AnimalInterface
  {
    public static void main(String args[])
    {
      Animal d=new Dog();
      Animal c=new Cat();
      Animal du=new Duck();
      d.sound("bow bow");
      d.food("pedegree");
      c.sound("meow meow");
      c.food("milk");
      du.sound("quack");
      du.food("grains");
    } 
    }
