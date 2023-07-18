/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a constructor that initializes these variables and display the car's details.*/
class Car
  {
    String model;
    int year;
    public void display()
    {
      System.out.println("Model is:"+model);
      System.out.println("Year:"+year);
    }
    public static void main(String args[])
    {
      Car c=new Car();
      Car c1=new Car();
      Car c2=new Car();
      c.model="BMW";
      c.year=1990;
      c1.model="Nano";
      c1.year=2010;
      c2.model="Maruti";
      c2.year=2000;
      c.display();
      c1.display();
      c2.display();
    }
  }