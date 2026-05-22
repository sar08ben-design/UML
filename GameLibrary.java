import java.util.HashSet;

/**
 * Represents a library that stores Game objects.
 *
 * @author Sarra
 * @version May 2026
 */
public class GameLibrary
{
    public HashSet<Game> library;

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
        library.add(g);
    }

    /**
     * Removes a game from the library.
     *
     * @param g the game to remove
     */
    public void removeGame(Game g)
    {
        library.remove(g);
    }

    
    
    /**
     * Returns the 3 best ranking games..
     *
     * 
     * @return the title of the games and their ranking
     */
    
    public String getTopGame(){
        String result="";
        
            for (int rank=1; rank<4;rank++){
                double rating=0;
                String gameTitle="";
                for (Game g: library){
                double r = g.getUserRating();
                if (r>rating && !result.contains(g.getTitle() + " - ")){
                    rating=r;
                    gameTitle= g.getTitle();
                }
            }
            result += rank + ". " + gameTitle + "-"+ rating + "/5\n";
            //learned \n in arduino workshop
        }
        return result;
    }
    
    /**
     * Returns the 3 top ranked games by genre.
     *
     * @param genre the genre to filter by
     * @return the top 3 games and their ratings for that genre
     */
        public String getTopGameByGenre(Genre genre) {
        String result = "";
        
        for (int rank = 1; rank < 4; rank++) {
            double rating = 0;
            String gameTitle = "";
            for (Game g : library) {
                double r = g.getUserRating();
                if (g.getGenre().equals(genre) && r > rating &&
                !result.contains(g.getTitle() + " - ")) {
                    rating = r;
                    gameTitle = g.getTitle();
                }
            }
            result += rank + ". " + gameTitle + " - " + rating + "/5\n";
        }
        System.out.print(result);
        return result;
        
    }
    
    /**
     * Returns the 3 top ranked games by platform.
     *
     * @param platform the platform to filter by
     * @return the top 3 games and their ratings for that platform
     */
    
    public String getTopGameByPlatform(Platform platform) {
        String result = "";
        
        for (int rank = 1; rank < 4; rank++) {
            double rating = 0;
            String gameTitle = "";
            for (Game g : library) {
                double r = g.getUserRating();
                if (g.getPlatform().equals(platform) && 
                r > rating && !result.contains(g.getTitle() + " - ")) {
                    rating = r;
                    gameTitle = g.getTitle();
                }
            }
            result += rank + ". " + gameTitle + " - " + rating + "/5\n";
        }
        return result;
    }
   

    /**
     * Checks whether a game title exists in the library.
     *
     * @param title the title to search for
     * @return true if the game exists, false otherwise
     */
    public boolean gameInLibrary(String title)
    {
        for (Game g : library)
        {
            if (g.getTitle().equalsIgnoreCase(title))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Finds a game by its title.
     *
     * @param title the title to search for
     * @return the matching game, or null if not found
     */
    public Game findGameByTitle(String title)
    {
        if (title == null)
        {
            return null;
        }

        for (Game g : library)
        {
            if (g.getTitle().equalsIgnoreCase(title.trim()))
            {
                return g;
            }
        }

        return null;
    }


    /**
     * Displays all games in the library.
     */
    public void listAllGame()
    {
        for (Game g : library)
        {
            g.showDetail();
            System.out.println("-----------");
        }
    }
    /**
     * Displays all games in the library that match the given genre.
     *
     * @param ge the genre to filter by
     */
    public void listByGenre(Genre ge) {
        for (Game g : library) {
            if (g.getGenre().equals(ge)) {
                g.showDetail();
                System.out.println("-----------");
            }
        }
    }
    /**
     * Displays all games in the library that match the given platform.
     *
     * @param p the platform to filter by
     */
    public void listByPlatform(Platform p) {
        for (Game g : library) {
            if (g.getPlatform().equals(p)) {
                g.showDetail();
                System.out.println("-----------");
            }
        }
    }
    /**
     * Displays all games in the library that match the given age rating.
     *
     * @param a the age rating to filter by
     */
    public void listByAgeRating(AgeRating a) {
        for (Game g : library) {
            if (g.getAgeRating().equals(a)) {
                g.showDetail();
                System.out.println("-----------");
            }
        }
    }
    
    /**
     * Displays all games in the library that match the given type.
     * Type can be "multiplayer" or "singleplayer".
     *
     * @param type the type of game to filter by
     */
        public void listByType(String type) {
        for (Game g : library) {
            if (type.equalsIgnoreCase("multiplayer") && g instanceof MultiPlayer) {
                System.out.println("Type: " + g.getClass().getSimpleName()); //There's a method called get name but it also prints the path which is useless
                
                g.showDetail();
                System.out.println("-----------");
            } else if (type.equalsIgnoreCase("singleplayer") && g instanceof SinglePlayer) {
                g.showDetail();
                System.out.println("-----------");
            }
        }
    }
}