/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Menu;

/**
 *
 * @author FPTSHOP
 */
public class LibraryController extends Menu {

    private UserController user;
    private BookController book;
    private OrderController order;

    public LibraryController() {
        super("Library Management System", new String[]{"User Management", "Book Management", "Order Management", "Exit"});
        user = new UserController();
        book = new BookController();
        order = new OrderController();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                user.run();
                break;
            case 2:
                book.run();
                break;
            case 3:
                order.run();
                break;
            default:
                System.out.println("bye..");
        }
    }
}
