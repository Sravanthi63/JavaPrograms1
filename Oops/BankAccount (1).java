/*Assignment 3: Method Overloading and Overriding Combined
Create a class BankAccount with methods deposit and withdraw. Implement method overloading to handle different variations of deposit and withdraw methods:
deposit(amount): Deposits the given amount.
deposit(amount, description): Deposits the given amount with a provided description.
withdraw(amount): Withdraws the given amount.
withdraw(amount, description): Withdraws the given amount with a provided description.*/
import java.util.*;
class BankDetails
  {
    int amt=25000;
    public void deposit(int deposit)
    {
      System.out.println(amt);
      amt=deposit+amt;
      System.out.println("After depositing the amount is:"+amt);
    }
    public void deposit(int deposit,String description)
    {
      System.out.println(amt);
      amt=deposit+amt;
      System.out.println("After depositing the amount is:"+amt);
      System.out.println(description);
    }
    public void withdraw(int draw)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Before withdraw amount is:"+amt);
      if(amt>draw)
      {
        amt=amt-draw;
        System.out.println("After withdraw balance amount is:"+amt);
      }
    }
    public void withdraw(int draw,String description)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Before withdraw amount is:"+amt);
    if(amt>draw)
    {
      amt=amt-draw;
      System.out.println("After withdraw balance amount is:"+amt);
      System.out.println(description);
    }
    }
  }
class BankAccount
  {
    public static void main(String args[])
    {
      BankDetails bd=new BankDetails();
      bd.deposit(2000);
      bd.deposit(1300,"Amount deposited successfully");
      bd.withdraw(1200);
      bd.withdraw(3000,"Amount withdraw successfully");
    }
  }