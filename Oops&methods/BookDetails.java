//display the book details by initializing the object using instance variables through array of objects
import java.util.*;
class BookDetails
  {
    String name;
    int id;
    int year;
    String author;
    public void display()
    {
      System.out.println("The book name is:"+name);
      System.out.println("The reference id is:"+id);
      System.out.println("The publication year is:"+year);
      System.out.println("The author name is:"+author);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      BookDetails b[]=new BookDetails[3];
      for(int i=0;i<b.length;i++)
        {
          System.out.println("Enter "+(i+1)+" Book Details");
          b[i]=new BookDetails();
          System.out.println("Enter Book Name");
          b[i].name=sc.next();
          System.out.println("Enter reference id");
          b[i].id=sc.nextInt();
          System.out.println("Enter publication year");
          b[i].year=sc.nextInt();
          System.out.println("Enter author name");
          b[i].author=sc.next();
        }
      for(int i=0;i<b.length;i++)
        {
          b[i].display();
        }
    }
  }