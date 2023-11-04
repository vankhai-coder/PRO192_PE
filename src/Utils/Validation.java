/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author FPTSHOP
 */
public class Validation {

    public Validation() {
    }

    public boolean checkEmpty(String str) {
        return str.isEmpty();
    }

    public boolean checkPositiveNumber(double n) {
        return n > 0;
    }
}
