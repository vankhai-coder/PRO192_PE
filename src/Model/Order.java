package Model;

/**
 *
 * @author FPTSHOP
 */
public class Order {
    private int orderID ,userID,bookID ,quantity ; 

    public Order(int orderID, int userID, int bookID, int quantity) {
        this.orderID = orderID;
        this.userID = userID;
        this.bookID = bookID;
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", userID=" + userID + ", bookID=" + bookID + ", quantity=" + quantity + '}';
    }
    
    
}
