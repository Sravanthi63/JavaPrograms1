/*Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement a method named initializeAccount that takes arguments for each variable and initializes the object. Implement another method named displayAccountDetails to display the account holder's name and balance.*/
class BankAccount1
  {
    String name;
    double balance;
    public void initializeAccount(String n,double b)
    {
      name=n;
      balance=b;
    }
    public void displayAccountDetails()
    {
      System.out.println("Account holder's name is:"+name);
      System.out.println("Account balance is:"+balance);
    }
    public static void main(String args[])
    {
      BankAccount1 b1=new BankAccount1();
      BankAccount1 b2=new BankAccount1();
      BankAccount1 b3=new BankAccount1();
      b1.initializeAccount("sravanthi",23000);
      b2.initializeAccount("yasaswi",32000);
      b3.initializeAccount("pooja",22100);
      b1.displayAccountDetails();
      b2.displayAccountDetails();
      b3.displayAccountDetails();
    }
  }
