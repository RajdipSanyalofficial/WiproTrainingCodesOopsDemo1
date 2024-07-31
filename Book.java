/**
 *Encapsulation, is to make sure that "sensitive" data is hidden from users(Main class).
 *  To achieve this, you must:
 *   declare class variables/attributes as private
 *  provide public get and set methods to access and update the value of a private variable
 *
 * The get method returns the value of the variable name. (output)
 *
 * The set method takes a parameter (newName) and assigns it to the name variable. (input)
 */

package oopsdemo1;

public class Book {

    //properties
    private int bookId;
    private String bookName;
    private float price;
    private String publisher;

    //Constructors - Java compiler creates default constructor for initialisation of Object properties

    //Generate Getters(Get the value) & Setters(Set the Value)

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    //In a new line RightClick --> Generate -- > Getter & Setter ---> SelectAll Fields( Ctrl+Click) -- Ok

    public float calculateDiscountPrice()
    {
        return((this.price)-(this.price*0.10f)); //offer 10% discount
    }

    //Constructor - Java Compiler creates default constructor for initialization of object properties

    //generate toString() method- converts book object to String
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
