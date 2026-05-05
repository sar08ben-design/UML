import java.util.HashSet;

/**
 * Represents a library that stores Game objects.
 *
 * @author Sarah
 * @version May 2026
 */
public class GameLibrary
{
    private HashSet<Game> library;

    /**
     * Creates an empty game library.
     */
    public GameLibrary()
    {
        library = new HashSet<>();
    }

    /**
     * Adds a game to the library.
     *
     * @param g the game to add
     */
    public void addGame(Game g)
    {
        if (g != null)
        {
            library.add(g);
        }
    }

    /**
     * Removes a game from the library.
     *
     * @param g the game to remove
     */
    public void removeGame(Game g)
    {
        if (g != null)
        {
            library.remove(g);
        }
    }

    /**
     * Returns the name of a game.
     *
     * @param g the game object
     * @return the name of the game
     */
    public String gameName(Game g)
    {
        return g.getTitle();
    }

    /**
     * Returns the genre of a game.
     *
     * @param g the game object
     * @return the genre of the game
     */
    public Genre gameGenre(Game g)
    {
        return g.getGenre();
    }

    /**
     * Returns the platform of a game.
     *
     * @param g the game object
     * @return the platform of the game
     */
    public Platform gamePlatform(Game g)
    {
        return g.getPlatform();
    }

    /**
     * Returns the age rating of a game.
     *
     * @param g the game object
     * @return the age rating of the game
     */
    public AgeRating gameAgeRating(Game g)
    {
        return g.getAgeRating();
    }

    /**
     * Checks whether a game title exists in the library.
     *
     * @param title the title to search for
     * @return true if the game is in the library, false otherwise
     */
    public boolean gameInLibrary(String title)
    {
        if (title == null){
            return false;
        }

        for (Game g : library){
            if (g.getTitle().equalsIgnoreCase(title.trim())){
                return true;
            }
        }

        return false;
    }

    /**
     * Finds a game in the library by its title.
     *
     * @param title the title of the game to find
     * @return the matching game, or null if not found
     */
    public Game findGameByTitle(String title)
    {
        if (title == null){
            return null;
        }

        for (Game g : library){
            if (g.getTitle().equalsIgnoreCase(title.trim())){
                return g;
            }
        }

        return null;
    }

    /**
     * Displays the details of one game.
     *
     * @param g the game to display
     */
    public void listGameDetail(Game g)
    {
        if (g != null){
            g.showDetail();
        }
    }

    /**
     * Displays all games stored in the library.
     */
    public void listAllGame()
    {
        if (library.isEmpty()){
            System.out.println("Library is empty.");
        }
        else{
            for (Game g : library){
                g.showDetail();
                System.out.println("-----------");
            }
        }
    }
}