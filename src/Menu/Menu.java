package Menu;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public int getUserInput() {
        int userInput = scanner.nextInt();
        return userInput;
    }

    public void mainMenu() {
        System.out.println("Welcome");
        System.out.println("Press 1 to create a order");
        System.out.println("Press 2 to check orderlist");
        System.out.println("Press 3 to login");
        System.out.println("Press 4 to exit program");


            switch (getUserInput()) {
                case 1:
                    System.out.println("You chose to create a order");
                    mainMenu();
                    break;


                case 2:
                    System.out.println("You chose to check the orderlist");
                    mainMenu();
                    break;

                case 3:
                    System.out.println("You chose to login");
                    int password = 45678;
                    System.out.println("Enter password");
                    int enterPassword = scanner.nextInt();
                    if (enterPassword == 45678) {
                        System.out.println("Welcome, here are your options: ");
                        //Statistics class
                    } else if (enterPassword != 45678) {
                        System.out.println("Error, wrong password!\n" + "You will be sent back to the menu");
                        System.out.println();
                        mainMenu(); //Try again
                    }
                    break;

                case 4:
                    break;
            }
        }



}
