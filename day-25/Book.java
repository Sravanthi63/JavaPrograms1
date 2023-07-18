/*Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.*/
class Book
  {
    String title;
    String author;
    int year;
    public void initializeBook(String t,String a,int y)
    {
      title=t;
      author=a;
      year=y;
    }
    public void display()
    {
      System.out.println("The title of the book is:"+title);
      System.out.println("The author of the book is:"+author);
      System.out.println("The publication year is:"+year);
    }
    public static void main(String args[])
    {
      Book b1=new Book();
      Book b2=new Book();
      Book b3=new Book();
      b1.initializeBook("Core Java","James",1980);
      b2.initializeBook("Python","sravanthi",2000);
      b3.initializeBook("DSP","lakshmi",2010);
      b1.display();
      b2.display();
      b3.display();
    }
  }