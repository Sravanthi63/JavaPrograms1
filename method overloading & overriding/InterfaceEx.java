interface Calculator
  {
    void addition(int a,int b);
    void substraction(int a,int b);
    void multiplication(int a,int b);
    void division(int a,int b);
  }
class Arithmetic implements Calculator
  {
    public void addition(int a,int b)
    {
      System.out.println(a+b);
    }
     public void substraction(int a,int b)
    {
      System.out.println(a-b);
    }
     public void multiplication(int a,int b)
    {
      System.out.println(a*b);
    }
     public void division(int a,int b)
    {
      System.out.println(a/b);
    }
  }
class InterfaceEx
{
  public static void main(String args[])
  {
    Calculator cal=new Arithmetic();
    cal.addition(23,5);
    cal.substraction(21,5);
    cal.multiplication(23,8);
    cal.division(100,3);
  }
}