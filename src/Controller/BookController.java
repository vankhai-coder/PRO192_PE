
package Controller;

import Model.Book;
import Model.User;
import Utils.Inputter;
import View.BookView;
import View.Menu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author FPTSHOP
 */
public class BookController extends Menu {

    private ArrayList<Book> listBook;
    private Inputter input;
    private BookView bookView;

    public BookController() {
        super("Book Management", new String[]{"Add a new book", "Display all", "Load from file", "Save to file", "Exit"});
        listBook = new ArrayList<>();
        input = new Inputter();
        bookView = new BookView();

    }

    public void add() {
        // nhap id : 
        int id;
        while (true) {
            id = input.getInt("id");
            if (checkIdExist(id)) {
                System.err.println("Id already exist..");
            } else {
                break;
            }
        }
        // nhap title : 
        String title = input.getString("title");
        // nhap author: 
        String authorName = input.getString("author's name");
        //nhap price : 
        double price = input.getDouble("price");
        //nhap amount : 
        int amount = input.getInt("amount");
        listBook.add(new Book(id, title, authorName, price, amount));
    }

    public void displayAll() {
        bookView.display(listBook);
    }

    public void loadFile() {
        // doc va add va listBook : 
    }

    public void saveFile() {
        // ghi vao file
    }

    public boolean checkIdExist(int id) {
        for (Book b : listBook) {
            if (b.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                add();
                break;
            case 2:
                displayAll();
                break;
            case 3:
                loadFile();
                break;
            case 4:
                saveFile();
                break;
            default:
                System.out.println("bye..");
        }
    }

}
