//using toString method
class EncapUsingtoStringMethod
  {
    String name;
    int rollno;
    String address;
    public String toString()
    {
      return name+" "+rollno+" "+address;
    }
    public static void main(String args[])
    {
      EncapUsingtoStringMethod e=new EncapUsingtoStringMethod();
      e.name="sravanthi";
      e.rollno=10;
      e.address="vijayawada";
      System.out.println(e);
    }
  }