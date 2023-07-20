/*Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Product
  {
    String name;
    int price;
    String quantity;
    Product(String n,int p,String q)
    {
      name=n;
      price=p;
      quantity=q;
    }
    public void display()
    {
      System.out.println("Product name is:"+name);
      System.out.println("Product price is:"+price);
      System.out.println("Product quantity is:"+quantity);
    }
    public static void main(String args[])
    {
      Product product=new Product("tomotoes",110,"1kg");
      product.display();
    }
  }