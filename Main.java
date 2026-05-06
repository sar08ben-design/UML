import java.util.Scanner;

/**
 * Driver class for the Game Library program.
 * Provides a menu to create and manage different kinds of games.
 */
public class Main
{
    /**
     * Entry point of the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        GameLibrary library = new GameLibrary();
        boolean running = true;

        while (running)
        {
            displayMainMenu();
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt())
            {
                System.out.println("Invalid input. Please enter a number.");
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
                    System.out.println("\nThank you for using the Game Library.");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1–4.");
            }
        }

        scanner.close();
    }

    /**
     * Displays the main menu.
     */
    public static void displayMainMenu()
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
     * Shows the add-game submenu and creates the selected type.
     *
     * @param scanner scanner for user input
     * @param library the game library
     */
    public static void addGameMenu(Scanner scanner, GameLibrary library)
    {
        System.out.println("\n--- Add a Game ---");
        System.out.println("1. Basic Game");
        System.out.println("2. MultiPlayer");
        System.out.println("3. SinglePlayer");
        System.out.print("Choose game category: ");
    
        if (!scanner.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
            return;
        }
    
        int mainType = scanner.nextInt();
        scanner.nextLine();
    
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
    
        System.out.print("Enter genre (ACTION, ADVENTURE, STRATEGY, SPORT, OPENWORLD, GAMBLE): ");
        Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());
    
        System.out.print("Enter age rating (E, E10, T, M, AO): ");
        AgeRating ageRating = AgeRating.valueOf(scanner.nextLine().toUpperCase());
    
        System.out.print("Enter platform (PC, MOBILE, PLAYSTATION, NINTENDO, XBOX): ");
        Platform platform = Platform.valueOf(scanner.nextLine().toUpperCase());
    
        System.out.print("Enter user rating (0-5): ");
        if (!scanner.hasNextDouble())
        {
            System.out.println("Invalid rating. Game not added.");
            scanner.nextLine();
            return;
        }
    
        double userRating = scanner.nextDouble();
        scanner.nextLine();
    
        try
        {
            switch (mainType)
            {
                case 1:
                {
                    Game game = new Game(title, genre, ageRating, platform, userRating);
                    library.addGame(game);
                    System.out.println("Basic game added.");
                    break;
                }
    
                case 2:
                {
                    System.out.println("\n--- MultiPlayer Types ---");
                    System.out.println("1. MultiPlayer");
                    System.out.println("2. Local");
                    System.out.println("3. Online");
                    System.out.print("Choose multiplayer type: ");
    
                    if (!scanner.hasNextInt())
                    {
                        System.out.println("Invalid input. Game not added.");
                        scanner.nextLine();
                        return;
                    }
    
                    int multiType = scanner.nextInt();
                    scanner.nextLine();
    
                    System.out.print("Enter party members: ");
                    int partyMembers = scanner.nextInt();
                    scanner.nextLine();
    
                    System.out.print("Enter player ID: ");
                    String playerId = scanner.nextLine();
    
                    System.out.print("Enter max players: ");
                    int maxPlayer = scanner.nextInt();
                    scanner.nextLine();
    
                    System.out.print("Enter host name: ");
                    String hostName = scanner.nextLine();
    
                    switch (multiType)
                    {
                        case 1:
                        {
                            MultiPlayer mp = new MultiPlayer(title, genre, ageRating, platform,
                                                             userRating, partyMembers, playerId, maxPlayer, hostName);
                            library.addGame(mp);
                            System.out.println("MultiPlayer game added.");
                            break;
                        }
    
                        case 2:
                        {
                            System.out.print("Enter controller count: ");
                            int controllerCount = scanner.nextInt();
    
                            System.out.print("Split screen (true/false): ");
                            boolean splitScreen = scanner.nextBoolean();
                            scanner.nextLine();
    
                            System.out.print("Enter location: ");
                            String location = scanner.nextLine();
    
                            Local local = new Local(title, genre, ageRating, platform,
                                                    userRating, partyMembers, playerId, maxPlayer, hostName,
                                                    controllerCount, splitScreen, location);
                            library.addGame(local);
                            System.out.println("Local multiplayer game added.");
                            break;
                        }
    
                        case 3:
                        {
                            System.out.print("Enter server name: ");
                            String serverName = scanner.nextLine();
    
                            System.out.print("Enter ping: ");
                            int ping = scanner.nextInt();
    
                            System.out.print("Connected (true/false): ");
                            boolean connected = scanner.nextBoolean();
                            scanner.nextLine();
    
                            Online online = new Online(title, genre, ageRating, platform,
                                                       userRating, partyMembers, playerId, maxPlayer, hostName,
                                                       serverName, ping, connected);
                            library.addGame(online);
                            System.out.println("Online multiplayer game added.");
                            break;
                        }
    
                        default:
                        {
                            System.out.println("Invalid multiplayer type.");
                            break;
                        }
                    }
                    break;
                }
    
                case 3:
                {
                    System.out.println("\n--- SinglePlayer Types ---");
                    System.out.println("1. SinglePlayer");
                    System.out.println("2. StoryMode");
                    System.out.print("Choose single-player type: ");
    
                    if (!scanner.hasNextInt())
                    {
                        System.out.println("Invalid input. Game not added.");
                        scanner.nextLine();
                        return;
                    }
    
                    int singleType = scanner.nextInt();
                    scanner.nextLine();
    
                    System.out.print("Enter seed: ");
                    int seed = scanner.nextInt();
    
                    System.out.print("Save world (true/false): ");
                    boolean saveWorld = scanner.nextBoolean();
    
                    System.out.print("Enter level: ");
                    int level = scanner.nextInt();
                    scanner.nextLine();
    
                    System.out.print("Enter difficulty: ");
                    String difficulty = scanner.nextLine();
    
                    switch (singleType)
                    {
                        case 1:
                        {
                            SinglePlayer sp = new SinglePlayer(title, genre, ageRating, platform,
                                                               userRating, seed, saveWorld, level, difficulty);
                            library.addGame(sp);
                            System.out.println("SinglePlayer game added.");
                            break;
                        }
    
                        case 2:
                        {
                            System.out.print("Enter chapter name: ");
                            String chapterName = scanner.nextLine();
    
                            System.out.print("Enter mission number: ");
                            int missionNumber = scanner.nextInt();
    
                            System.out.print("Final boss unlocked (true/false): ");
                            boolean finalBossUnlocked = scanner.nextBoolean();
                            scanner.nextLine();
    
                            StoryMode sm = new StoryMode(title, genre, ageRating, platform,
                                                         userRating, seed, saveWorld, level, difficulty,
                                                         chapterName, missionNumber, finalBossUnlocked);
                            library.addGame(sm);
                            System.out.println("StoryMode game added.");
                            break;
                        }
    
                        default:
                        {
                            System.out.println("Invalid single-player type.");
                            break;
                        }
                    }
                    break;
                }
    
                default:
                {
                    System.out.println("Invalid game category.");
                    break;
                }
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    /**
     * Handles removing a game by title.
     *
     * @param scanner scanner for user input
     * @param library the game library
     */
    public static void removeGameMenu(Scanner scanner, GameLibrary library)
    {
        System.out.println("\n--- Remove a Game ---");
        System.out.print("Enter the title of the game to remove: ");
        String title = scanner.nextLine();

        Game toRemove = library.findGameByTitle(title);

        if (toRemove != null)
        {
            library.removeGame(toRemove);
            System.out.println("Game removed successfully.");
        }
        else
        {
            System.out.println("Game not found in the library.");
        }
    }
}