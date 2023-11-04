/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Order;
import Model.User;
import Utils.Inputter;
import View.Menu;
import View.OrderView;
import java.util.ArrayList;

/**
 *
 * @author FPTSHOP
 */
public class OrderController extends Menu {

    private ArrayList<Order> listOrder;
    private Inputter input;
    private OrderView orderView;

    public OrderController() {
        super("Order Management", new String[]{"Add a new order ", "Display add", "Exit"});
        listOrder = new ArrayList<>();
        input = new Inputter();
        orderView = new OrderView();
    }

    public void add() {
        int orderId;
        while (true) {
            orderId = input.getInt("order id");
            if (checkIdExist(orderId)) {
                System.err.println("Id already exist..");
            } else {
                break;
            }
        }
        // nhap userId ; 
        int userId = input.getInt("user id");
        // nhap bookId : 
        int bookId = input.getInt("book id");
        // nhap so luong : 
        int quantity = input.getInt("quantity");
        listOrder.add(new Order(orderId, userId, bookId, quantity));
        System.out.println("Add order successfully..");
    }

    public void displayAll() {
        orderView.display(listOrder);
    }

    public boolean checkIdExist(int id) {
        for (Order o : listOrder) {
            if (o.getOrderID() == id) {
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
            default:
                System.out.println("bye..");
        }
    }
    

}
