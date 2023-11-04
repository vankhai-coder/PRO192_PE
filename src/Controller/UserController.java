/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Utils.Inputter;
import View.Menu;
import View.UserView;
import java.util.ArrayList;

/**
 *
 * @author FPTSHOP
 */
public class UserController extends Menu {

    private ArrayList<User> listUser;
    private Inputter input;
    private UserView userView;

    public UserController() {
        super("User Management", new String[]{"Add a new user", "Display all", "Exit"});
        listUser = new ArrayList<>();
        input = new Inputter();
        userView = new UserView();
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
        // nhap firstName ; 
        String firstName = input.getString("first name");
        // nhap lastName ; 
        String lastName = input.getString("last name");
        // nhap phone : 
        String phone = input.getPhone();
        // nhap balance : 
        double balance = input.getDouble("balance");
        listUser.add(new User(id, firstName, lastName, phone, balance));
        System.out.println("Add successfully..");
    }

    public void displayAll() {
        userView.display(listUser);
    }

    public boolean checkIdExist(int id) {
        for (User u : listUser) {
            if (u.getId() == id) {
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
