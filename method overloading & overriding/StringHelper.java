/*Assignment 1: Method Overloading
Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:
Concatenate two strings.
Concatenate three strings.
Concatenate a list of strings.*/
class Concatenation
  {
    void concatenate(String str1,String str2)
    {
      System.out.println("Concatenation of two strings is:"+str1.concat(str2));
    }
    void concatenate(String str1,String str2,String str3)
    {
      String str=(str1.concat(str2));
      System.out.println("Concatenation of three strings is:"+str.concat(str3));
    }
  }
class StringHelper
  {
    public static void main(String args[])
    {
      Concatenation c=new Concatenation();
      c.concatenate("Hello","vijayawada");
      c.concatenate("Welcome","to","bitlabs");
    }
  }