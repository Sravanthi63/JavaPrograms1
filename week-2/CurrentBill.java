import java.util.Scanner;
class CurrentBill
  {
    public static void main(String args[])
    {
      float amt,subcharge,total;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter previous units");
      float pre=s.nextFloat();
      System.out.println("Enter present units");
      float pres=s.nextFloat();
      float units=pres-pre;
      System.out.println("Num of units is: "+units);
      if(units<=50)
      {
       amt = units*0.50f;
      }
      else if(units>50&&units<=150)
      {
        amt= units*0.75f;
      }
      else if(units>150&&units<=250)
      {
        amt=units*1.20f;
      }
      else 
      {
        amt=units*1.50f;
      }
      subcharge= amt*0.2f;
      System.out.println(subcharge);
      total=amt+subcharge;
      System.out.println("Your current bill amount is "+total);
    }
  }