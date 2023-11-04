package Model;

/**
 *
 * @author FPTSHOP
 */
public class Book {
    private int id ; 
    private String title,authorName ; 
    private double price ; 
    private int amount ; 

    public Book(int id, String title, String authorName, double price, int amount) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", authorName=" + authorName + ", price=" + price + ", amount=" + amount + '}';
    }
    
    
}
