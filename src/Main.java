import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Expedition game = new Expedition();
        boolean running = true;

        System.out.println("------------------");
        System.out.println("RELIC EXPEDITION");
        System.out.println("------------------");

        while (running) {
            printMenu();
            System.out.print("Your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    startGame(input, game);
                    break;
                case 2:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    break;
            }
        }

        System.out.println("Goodbye!");
        input.close();
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("----- MAIN MENU -----");
        System.out.println("1. New game");
        System.out.println("2. Exit");
    }

    public static void startGame(Scanner input, Expedition game) {
        int rows = readSize(input, "Number of rows (5-12): ");
        int cols = readSize(input, "Number of columns (5-12): ");

        if (game.startNewGame(rows, cols)) {
            System.out.println();
            System.out.println("A new " + rows + "x" + cols + " expedition has started!");
            printStatus(game);
            System.out.println("(Map generation and gameplay will be added in Stage 2.)");
        } else {
            System.out.println("The game could not be started.");
        }
    }

    // Asks again until the number is between 5 and 12.
    public static int readSize(Scanner input, String prompt) {
        System.out.print(prompt);
        int value = input.nextInt();
        while (value < 5 || value > 12) {
            System.out.println("Please enter a number between 5 and 12.");
            System.out.print(prompt);
            value = input.nextInt();
        }
        return value;
    }

    public static void printStatus(Expedition game) {
        System.out.println("Status   : " + game.getStatus());
        System.out.println("Position : (" + game.getRow() + ", " + game.getColumn() + ")");
        System.out.println("Energy   : " + game.getEnergy() + " / " + game.getMaxEnergy());
        System.out.println("Relics   : " + game.getCollectedRelics() + " / " + game.getRequiredRelics());
        System.out.println("Moves    : " + game.getMoves());
        System.out.println("Score    : " + game.getScore());
    }
}
