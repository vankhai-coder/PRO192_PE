package View;

import java.util.Scanner;

public abstract class Menu {

    protected String title;
    protected String[] mchon;
///==================================================

///==================================================
    public Menu(String td, String[] mc) {
        title = td;
        mchon = mc;
    }
///==================================================

    public void display() {
        System.out.println(title);
        // System.out.println("====================");
        for (int i = 0; i < mchon.length; i++) {
            System.out.println((i + 1) + "." + mchon[i]);
        }
    }
///==================================================

    public int getSelected() {
        display();
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.print("Enter selection : ");
                n = Integer.parseInt(sc.nextLine());
                if (n >= 1 && n <= mchon.length) {
                    return n;
                } else {
                    System.out.println("enter number from 1 to " + mchon.length);
                }
            } catch (Exception e) {
                System.out.println("Enter number please !");
            }
        }

    }

///==================================================
    public abstract void execute(int n);
///==================================================

    public void run() {
        while (true) {
            int n = getSelected();
            execute(n);
            if (n == mchon.length) {
                break;
            }

        }

    }
}
