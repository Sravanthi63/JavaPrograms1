/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.*/
class Car1
  {
    String make;
    String model;
    int year;
    public void setCarDetails(String ma,String m,String y)
    {
      make=ma;
      model=m;
      year=y;
    }
    public void dispaly()
    {
      System.out.println("Make:"+make);
      System.out.println("The car model is:"+model);
      System.out.println("Year:"+year);
    }
    public static void main(String args[])
    {
      Car1 c=new Car1();
      Car1 c1=new Car1();
      Car1 c2=new Car1();
      c.setCarDetails("Maruti","suzuki",2010);
      c1.setCarDetails("Kia","seltos",2023);
      c2.setCarDetails("Mahindra","Hyundai",2000);
      c.display();
      c1.display();
      c2.display();
    }
  }