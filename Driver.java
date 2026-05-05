import java.util.Scanner;

/**
 * Driver class for the Game Library program.
 * Displays a menu and allows the user to manage games.
 *
 * @author Sarah, Anuj
 * @version May 2026
 */
public class Driver
{
    /**
     * Main method of the program.
     * Runs the menu-driven game library system.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        GameLibrary library = new GameLibrary();
        boolean running = true;

        while (running)
        {
            displayMenu();

            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt())
            {
                System.out.println("Invalid input. Please enter a number from 1 to 4.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    addGameMenu(scanner, library);
                    break;

                case 2:
                    removeGameMenu(scanner, library);
                    break;

                case 3:
                    System.out.println("\n===== GAME LIBRARY CONTENT =====");
                    library.listAllGame();
                    break;

                case 4:
                    running = false;
                    System.out.println("\nThank you for using the Game Library program.");
                    System.out.println("Program closed successfully.");
                    break;

                default:
                    System.out.println("Invalid menu choice. Please select 1, 2, 3, or 4.");
            }
        }

        scanner.close();
    }

    /**
     * Displays the main menu.
     */
    public static void displayMenu()
    {
        System.out.println("\n==================================");
        System.out.println("        GAME LIBRARY MENU         ");
        System.out.println("==================================");
        System.out.println("1. Add a game");
        System.out.println("2. Remove a game");
        System.out.println("3. List all games");
        System.out.println("4. Exit");
        System.out.println("==================================");
    }

    /**
     * Handles the menu option for adding a game.
     *
     * @param scanner the scanner used for input
     * @param library the game library
     */
    public static void addGameMenu(Scanner scanner, GameLibrary library)
    {
        try
        {
            System.out.println("\n--- Add a New Game ---");

            System.out.print("Enter title: ");
            String title = scanner.nextLine();

            System.out.print("Enter genre (ACTION, ADVENTURE, STRATEGY, SPORT, OPENWORLD, GAMBLE): ");
            Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Enter age rating (E, E10, T, M, AO): ");
            AgeRating ageRating = AgeRating.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Enter platform (PC, MOBILE, PLAYSTATION, NINTENDO, XBOX): ");
            Platform platform = Platform.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Enter user rating (0 to 5): ");

            if (!scanner.hasNextDouble())
            {
                System.out.println("Invalid rating. Please enter a number.");
                scanner.nextLine();
                return;
            }

            double userRating = scanner.nextDouble();
            scanner.nextLine();

            Game game = new Game(title, genre, ageRating, platform, userRating);
            library.addGame(game);

            System.out.println("\nGame added successfully.");
            System.out.println("Added game: " + game);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    /**
     * Handles the menu option for removing a game.
     *
     * @param scanner the scanner used for input
     * @param library the game library
     */
    public static void removeGameMenu(Scanner scanner, GameLibrary library)
    {
        System.out.println("\n--- Remove a Game ---");
        System.out.print("Enter the title of the game to remove: ");
        String title = scanner.nextLine();

        Game gameToRemove = library.findGameByTitle(title);

        if (gameToRemove != null)
        {
            library.removeGame(gameToRemove);
            System.out.println("Game removed successfully.");
        }
        else
        {
            System.out.println("Game not found in the library.");
        }
    }
}