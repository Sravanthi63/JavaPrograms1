//Method over loading
/*Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:
Perform addition.
Perform subtraction.
Perform multiplication.
Perform division.*/
class Operations
  {
    void arithmetic(float a,float b)
    {
      float add=a+b;
      System.out.println("Addition:"+add);
    }
    void arithmetic(int a,float b)
    {
      float sub=a-b;
      System.out.println("Substraction:"+sub);
    }
    void arithmetic(float a,int b)
    {
      float mul=a*b;
      System.out.println("Multiplication:"+mul);
    }
    void arithmetic(int a,int b)
    {
      int div=a%b;
      System.out.println("Division:"+div);
    }
  }
class MathOperations
  {
    public static void main(String args[])
    {
      Operations o=new Operations();
      o.arithmetic(5.3f,4.1f);
      o.arithmetic(5,9.3f);
      o.arithmetic(4.2f,1);
      o.arithmetic(9,3);
    }
  }