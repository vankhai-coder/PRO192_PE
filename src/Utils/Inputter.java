package Utils;

import java.util.Scanner;

/**
 *
 * @author FPTSHOP
 */
public class Inputter {

    private Validation val;
    private Scanner sc;

    public Inputter() {
        this.val = new Validation();
        this.sc = new Scanner(System.in);
    }

    public String getString(String name) {
        String str;
        while (true) {
            System.out.print("Enter " + name + " : ");
            str = sc.nextLine().trim();
            if (val.checkEmpty(str)) {
                System.err.println(name + " can not empty..");
            } else {
                return str;
            }
        }
    }

    public int getInt(String name) {
        int n;
        while (true) {
            try {
                System.out.print("Enter " + name + " : ");
                n = Integer.parseInt(sc.nextLine());
                if (val.checkPositiveNumber(n)) {
                    return n;
                } else {
                    System.err.println(name + " can must positive..");
                }
            } catch (Exception e) {
                System.err.println("Enter number please..");
            }
        }

    }

    public double getDouble(String name) {
        double n;
        while (true) {
            try {
                System.out.print("Enter " + name + " : ");
                n = Double.parseDouble(sc.nextLine());
                if (val.checkPositiveNumber(n)) {
                    return n;
                } else {
                    System.err.println(name + " must be positive..");
                }
            } catch (Exception e) {
                System.err.println("Enter number please..");
            }
        }

    }

    public String getPhone() {
        String phone;
        
        while (true) {            
            System.out.print("Enter phone : ");
            phone = sc.nextLine().trim(); 
            if(phone.matches("\\d{10}")){
            return phone ; 
            }else{
                System.err.println("Phone must be 10 digits...");
            }
        }
    }
}
