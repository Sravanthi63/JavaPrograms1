/*Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement methods to deposit and withdraw money from the account, and display the current balance.*/
import java.util.*;
class BankAccount
  {
    String name="sravanthi";
    long acnum=053510100125l;
    int amount=20000;
    int deposit;
    int withdraw;
    public void depositamt()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the amount you want to deposit");
      deposit=sc.nextInt();
      amount=amount+deposit;
      System.out.println("The amount "+deposit+ "credited to your account");
      System.out.println("Amount in your account is "+amount);
    }
    public void display()
    {
      System.out.println("The Bank Details are");
      System.out.println("Account holder name:"+name);
      System.out.println("Account Number" +acnum);
      System.out.println("The balance amount "+amount);
    }
    public void withdrawamt()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the amount you want to withdraw");
      withdraw=sc.nextInt();
      if(amount>withdraw)
      {
        amount=amount-withdraw;
        System.out.println("The amount "+withdraw+ " to your account successfully");
        System.out.println("The amount in your account is "+amount);
      }
      else
        System.out.println("Insufficient amount");
    }
    public static void main(String args[])
    {
      BankAccount b=new BankAccount();
      b.display();
      b.depositamt();
      b.withdrawamt();
    }
  }