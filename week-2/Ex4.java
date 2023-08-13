import java.util.Scanner;
public class Ex4 
{
    public static void main(String[] args)
  {
        int n1=12,n2=45;
        System.out.println("Enter the first number: "+n1);
        System.out.println("Enter the second number: "+n2);
       System.out.println("Before swapping: " +n1 + ", " + n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
         System.out.println("After swapping: " + n1 + ", " + n2);
    }

}