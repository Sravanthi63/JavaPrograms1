/*Assignment 1: Method Overloading
In this assignment, you are required to create a class called Calculator that implements method overloading for addition. The Calculator class should have three different methods named add, each with a different number of parameters:
add(a, b): This method should take two integer parameters and return their sum.
add(a, b, c): This method should take three integer parameters and return their sum.
add(a, b, c, d): This method should take four integer parameters and return their sum.*/
class Operations
  {
    void add(int a,int b)
    {
      System.out.println("The sum of two interger is:"+(a+b));
    }
    void add(int a,float b,int c)
    {
      System.out.println("The sum of three integers is:"+(a+b+c));
    }
    void add(float a,int b,float c,int d)
    {
      System.out.println("The sum of four integers is:"+(a+b+c+d));
    }
  }
class Calculator
  {
    public static void main(String args[])
    {
   Operations o=new Operations();
    o.add(2,5);
    o.add(5,7.3f,6);
    o.add(4.3f,8,2.1f,8);
}
  }