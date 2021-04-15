package Menu;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("Welcome");
        System.out.println("Press 1 to create a order");
        System.out.println("Press 2 to check orderlist");
        System.out.println("Press 3 to login");
    }

    public int getUserInput() {
        int userInput = scanner.nextInt();
        return userInput;
    }

}
