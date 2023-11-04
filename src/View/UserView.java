/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.ArrayList;

/**
 *
 * @author FPTSHOP
 */
public class UserView {

    public <T> void display(ArrayList<T> list) {
        if (list.isEmpty()) {
            System.out.println("list is empty..");
        }
        for (T x : list) {
            System.out.println(x);
        }
    }
}
