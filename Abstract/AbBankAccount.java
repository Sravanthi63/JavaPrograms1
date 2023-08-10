/*Assignment 2: Bank Account Hierarchy
Create an abstract class called "BankAccount" that has the following abstract methods:
deposit(amount): Adds the given amount to the account balance.
withdraw(amount): Deducts the given amount from the account balance.
get_balance(): Returns the current account balance.
Create concrete classes CheckingAccount and SavingsAccount that inherit from the abstract class "BankAccount." Implement the required methods for each class.
Write a program to:
Create instances of CheckingAccount and SavingsAccount.
Prompt the user to make deposits and withdrawals from each account.
Display the current balance of each account after each transaction.*/
import java.util.*;
abstract class BankAccount
  {
    double amount=15000;
    Scanner sc=new Scanner(System.in);
    abstract void depositeAmount(double deposite);
    abstract void withdrawAmount(double withdraw);
    abstract void get_Balance();
  }
class CheckingAccount extends BankAccount
  {
    public void depositeAmount(double deposite)
    {
      amount=amount+deposite;
      System.out.println("Deposited Sucessfully");
    System.out.println("The Total Amount Available in your Account is "+amount);
    }
     public void withdrawAmount(double withdraw)
    {
      amount=amount-withdraw;
      System.out.println("Withdraw Sucessfully");
      System.out.println("The Remaining Account Balance is "+amount);
    }
    public void get_Balance()
    {
      System.out.println("The Amount in the Account is "+amount);
    }
  }
class SavingsAccount extends BankAccount
  {
    public void depositeAmount(double deposite)
    {
      amount=deposite+amount;
      System.out.println("Deposited Sucessfully");
      System.out.println("The Remaining Balance in Account is "+amount);
    }
    public void withdrawAmount(double withdraw)
    {
      amount=amount-withdraw;
      System.out.println("Withdraw Sucessfully");
      
    }
    public void get_Balance()
    {
      System.out.println("The Available Balance in the Account "+amount);
    }
  }
class AbBankAccount
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      BankAccount c=new CheckingAccount();
      BankAccount s=new SavingsAccount();
      System.out.println("Enter the Deposite Amount");
      c.depositeAmount(sc.nextDouble());
      System.out.println("Enter The Withdraw Amount");
      c.withdrawAmount(sc.nextDouble());
      c.get_Balance();
      System.out.println("Enter the Deposite Amount");
      s.depositeAmount(sc.nextDouble());
      System.out.println("Enter The Withdraw Amount");
      s.withdrawAmount(sc.nextDouble());
      s.get_Balance();
    }
 }


