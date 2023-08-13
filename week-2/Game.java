import java.util.Scanner;
class Game
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter user value");
      char user=sc.next().charAt(0);
      System.out.println("Enter computer value");
      char comp=sc.next().charAt(0);
      if((user=='r'&&comp=='p')||(user=='R'&&comp=='p'))
      {
        System.out.println("Computer is the winner");
      }
      else if((user=='p'&&comp=='r')||(user=='P'&&comp=='R'))
      {
        System.out.println("User is the winner");
      }
      else if((user=='r'&&comp=='s')||(user=='R'&&comp=='S'))
      {
        System.out.println("User is the winner");
      }
      else if((user=='s'&&comp=='r')||(user=='S'&&comp=='R'))
      {
        System.out.println("User is the winner");
      }
      else if((user=='p'&&comp=='s')||(user=='P'&&comp=='S'))
      {
        System.out.println("User is the winner");
      }
      else if((user=='s'&&comp=='p')||(user=='S'&&comp=='P'))
      {
        System.out.println("User is the winner");
      }
      else 
      {
        System.out.println("Invalid input for gaming");
      }
    }
      }