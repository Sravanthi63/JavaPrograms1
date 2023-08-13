import java.util.Scanner;
class GrossSal
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      double hra,da;
      System.out.println("enter the basic salary");
      double basic=sc.nextDouble();
      if(basic<=10000)
      {
        hra=((basic*20)/100);
        da=((basic*80)/100);
      }
      else if(basic>10000 && basic<=20000)
      {
        hra=((basic*25)/100);
        da=((basic*90)/100);
      }
      else
      {
        hra=((basic*30)/100);
        da=((basic*95)/100);
      }
      double gross=basic+hra+da;
      System.out.println("gross salary = "+gross);
    }
  }
 