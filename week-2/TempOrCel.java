import java.util.Scanner;
class TempOrCel
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter c or f to convert the temperature");
      char ch=sc.next().charAt(0);
      if(ch=='c'||ch=='C')
      {
        System.out.println("enter the value of the temperature ");
        double celcius=sc.nextDouble();
        double fahrenheit=((celcius*1.8)+32);
        System.out.println("the temperature is "+fahrenheit);
       
      }
      else if(ch=='f'||ch=='F')
      {
        System.out.println("enter the value of the temperature ");
        double fahrenheit=sc.nextDouble();
        double celcius=((fahrenheit-32)*(5/9));
        System.out.println("the temperature is "+celcius);
      }
      else
      {
        System.out.println("invalid input");
      }
    }
  }
