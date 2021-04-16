package Menu;

import java.util.Scanner;

public class LoginMenu {

    Scanner loginsc = new Scanner(System.in);

    public int getLoginInput() {
        int loginInput = loginsc.nextInt();
        return loginInput;
    }

    public void advancedLoginMenu() {

        System.out.println("Welcome");
        System.out.println();
        System.out.println("Here are your options:\nPress 1 one for Create order\nPress 2 to See the pizza statistics\n");

        switch (getLoginInput()) {
            case 1:
                System.out.println("You chose to create a new order: ");
                break;

            case 2:
                System.out.println("You chose to see the statistics for the pizzas");
                break;


        }
    }
}

