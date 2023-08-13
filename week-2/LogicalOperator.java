class LogicalOperator
  {
    public static void main(String args[])
    {
      int a=20,b=45,c=54;
      System.out.println((a>b)&&(a>c));
      System.out.println((a<b)||(a>c));
      System.out.println(!(a>b)&&(a<c));
    }
  }