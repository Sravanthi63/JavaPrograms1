import java.util.Scanner;
class EmpSal
  {
    public static void main(String args[])
    {
      double tax,netsal;
      Scanner sc=new Scanner(System.in);
      System.out.println("Employee salary is");
      double sal=sc.nextDouble();
      double annualsal=(sal*12);
      System.out.println("Your Annual Salary is "+annualsal);
      if(annualsal<=300000)
      {
        System.out.println("No need to pay tax");
        System.out.println("Your Net salary is "+annualsal);
      }
      else if((annualsal>300000)&&(annualsal<=600000))
      {
        tax=((annualsal*5)/100);
        netsal=annualsal-tax;
        System.out.println("Your Tax amount is "+tax);
        System.out.println("Your Net salary is "+netsal);
      }
      else if((annualsal>600000)&&(annualsal<=900000))
      {
        tax=((annualsal*10)/100);
        netsal=annualsal-tax;
        System.out.println("Your Tax amount is "+tax);
        System.out.println("Your Net salary is "+netsal);
      }
      else if((annualsal>900000)&&(annualsal<=1200000))
      {
        tax=((annualsal*20)/100);
        netsal=annualsal-tax;
        System.out.println("Your Tax amount is "+tax);
        System.out.println("Your Net salary is "+netsal);
      }
      else if((annualsal>1300000)&&(annualsal<=1500000))
      {
        tax=((annualsal*25)/100);
        netsal=annualsal-tax;
        System.out.println("Your Tax amount is "+tax);
        System.out.println("Your Net salary is "+netsal);
      }
       else 
      {
        tax=((annualsal*30)/100);
        netsal=annualsal-tax;
        System.out.println("Your Tax amount is "+tax);
        System.out.println("Your Net salary is "+netsal);
      }
    }
  }