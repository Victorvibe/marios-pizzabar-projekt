package Menu;
import Orders.OrderList;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    OrderList orderList = new OrderList();
    LoginMenu loginMenu = new LoginMenu();

    public int getUserInput() {
        int userInput = scanner.nextInt();
        return userInput;
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("Welcome!");
        System.out.println("Press 1 to create a order");
        System.out.println("Press 2 to check the orderlist");
        System.out.println("Press 3 to login");
        System.out.println("Press 4 to exit program");

            switch (getUserInput()) {
                case 1:
                    System.out.println("You chose to create a order: ");
                    System.out.println();
                    newOrder();
                    //Controller to add the pizza to the arraylist etc.
                    mainMenu();
                    if (getUserInput() == 0) {
                        mainMenu();
                    }
                    break;

                case 2:
                    System.out.println("You chose to check the orderlist: ");
                    System.out.println();
                    mainMenu();
                    if (getUserInput() == 0) {
                        mainMenu();
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("You chose to login");
                    int password = 45678;
                    System.out.println("Enter password: ");
                    int enterPassword = scanner.nextInt();
                    if (enterPassword == 45678) {
                        loginMenu.advancedLoginMenu();
                    }
                    else if (enterPassword != 45678) {
                        System.out.println("Error, wrong password!\n" + "You will be sent back to the menu");
                        System.out.println();
                        mainMenu(); //Try again
                    }
                    break;

                case 4:
                    break;
            }
        }

        public void newOrder() {
        Scanner userInput = new Scanner(System.in);

            System.out.println("Enter the customers name: ");
            String name = userInput.nextLine();
            System.out.println("Enter the pizza ID: ");
            int pizzaID = userInput.nextInt();
            System.out.println("Any comments to the order? etc: +/-: ");
            String comment = userInput.nextLine();
            System.out.println("What time do you want to pick up?: ");
            double puTime = userInput.nextDouble();

        }



}
