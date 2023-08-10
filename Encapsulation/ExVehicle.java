//Method overriding
/*Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting."*/
class Vehicle
  {
    void start_engine()
    {
      System.out.println("Engine starting");
    }
  }
class Car extends Vehicle
  {
    void start_engine()
    {
      System.out.println("Car engine starting");
    }
  }
class Motorcycle extends Vehicle
  {
    void start_engine()
    {
      System.out.println("Motorchycle engine starting");
    }
  }
class ExVehicle
  {
    public static void main(String args[])
    {
      Vehicle v=new Vehicle();
      v.start_engine();
      Vehicle car=new Car();
      car.start_engine();
      Vehicle mc=new Motorcycle();
      mc.start_engine();
    }
  }