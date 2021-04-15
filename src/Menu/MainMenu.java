package Menu;

public class MainMenu {

    public static void main(String[] args) {

        Menu menu = new Menu();

        boolean userWantToExit = false;
        while (userWantToExit == false) {
            int userInput = menu.getUserInput();
            switch (userInput) {
                case 1:
                    System.out.println("You chose to create a new order");


            }
        }
    }
}
