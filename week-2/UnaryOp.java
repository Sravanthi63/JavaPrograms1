class UnaryOp
  {
    public static void main(String args[])
    {
      int a=90,b=21;
      System.out.println(a=a+1);
      System.out.println(a-=1);
      System.out.println(a=a*(b+1));
      System.out.println(a/=(b+1));
      System.out.println(a%=b);
    }
  }