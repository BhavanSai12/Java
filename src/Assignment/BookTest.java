package Assignment;
/*
Create a class Book with the data members bno,bname,price.
Create a class SpecialEditionBook which is subclass of Book and with a data
member
discount. Create a class BookTest with main() to test the above classes
Note
- Use constructors to give the values to the data members
- create a method display() in Book class which displays bno,bname and price
and override the same display() of Book class in SpecialEditionBook which
displays bno,bname,price using super.display() and display the value of
discount.

 */
class Book{
    int bookNo;
    String bookName;
    double price;
    public Book(int bookNo,String bookName,double price){
        this.bookNo=bookNo;
        this.bookName=bookName;
        this.price=price;

    }
    void display(){
        System.out.println("Book Number: "+bookNo);
        System.out.println("Book Name: "+bookName);
        System.out.println("Book Price: "+price);
    }
}
class specialEditionBook extends Book{
    int discount;

    public specialEditionBook(int bookNo, String bookName, double price,int discount) {
        super(bookNo, bookName, price);
        this.discount=discount;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Book Discount: "+discount);
        price=price-discount;
        System.out.println("After Discount: Book Details");
        super.display();
    }
}
public class BookTest {
    public static void main(String[]args){
        specialEditionBook sp= new specialEditionBook(1947,"Bhavan",2500.00,250);
        sp.display();
        Book newBook=new Book(1857,"sorry",3500.25);
        newBook.display();
    }
}
