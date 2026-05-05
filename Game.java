/**
 * Represents a game in the game library.
 * Stores basic information such as title, genre, age rating,
 * platform, user rating, and play status.
 *
 * @author Sarah, Anuj
 * @version 1.0
 */
public class Game
{
    private String title;
    private Genre genre;
    private AgeRating ageRating;
    private Platform platform;
    private double userRating;
    private boolean inProgress;

    /**
     * Creates a new Game object.
     *
     * @param title the title of the game
     * @param genre the genre of the game
     * @param ageRating the age rating of the game
     * @param platform the platform of the game
     * @param userRating the user rating from 0 to 5
     */
    public Game(String title, Genre genre, AgeRating ageRating,
                Platform platform, double userRating)
    {
        if (title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title cannot be empty.");
        }

        if (genre == null || ageRating == null || platform == null){
            throw new IllegalArgumentException("Genre, age rating, and platform cannot be null.");
        }

        if (userRating < 0 || userRating > 5){
            throw new IllegalArgumentException("User rating must be between 0 and 5.");
        }

        this.title = title.trim();
        this.genre = genre;
        this.ageRating = ageRating;
        this.platform = platform;
        this.userRating = userRating;
        this.inProgress = false;
    }

    /**
     * Starts the game.
     */
    public void startGame()
    {
        inProgress = true;
        System.out.println("Starting game: " + title);
    }

    /**
     * Displays the details of the game.
     */
    public void showDetail()
    {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Age rating: " + ageRating);
        System.out.println("Platform: " + platform);
        System.out.println("User rating: " + userRating);
        System.out.println("In progress: " + inProgress);
    }

    /**
     * Updates the user rating.
     *
     * @param newRating the new rating from 0 to 5
     */
    public void updateRating(double newRating)
    {
        if (newRating < 0 || newRating > 5){
            System.out.println("Invalid rating. Enter a value between 0 and 5.");
            return;
        }

        userRating = newRating;
    }

    /**
     * Returns the title of the game.
     *
     * @return the title of the game
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the genre of the game.
     *
     * @return the genre of the game
     */
    public Genre getGenre()
    {
        return genre;
    }

    /**
     * Returns the age rating of the game.
     *
     * @return the age rating of the game
     */
    public AgeRating getAgeRating()
    {
        return ageRating;
    }

    /**
     * Returns the platform of the game.
     *
     * @return the platform of the game
     */
    public Platform getPlatform()
    {
        return platform;
    }

    /**
     * Returns the user rating of the game.
     *
     * @return the user rating
     */
    public double getUserRating()
    {
        return userRating;
    }

    /**
     * Returns whether the game is currently in progress.
     *
     * @return true if the game is in progress, false otherwise
     */
    public boolean isInProgress()
    {
        return inProgress;
    }

    /**
     * Compares this game to another object.
     *
     * @param obj the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Game)){
            return false;
        }

        Game other = (Game) obj;
        return title.equalsIgnoreCase(other.title) && platform == other.platform;
    }

    /**
     * Returns the hash code for this game.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode()
    {
        return title.toLowerCase().hashCode() + platform.hashCode();
    }

    /**
     * Returns a string representation of the game.
     *
     * @return a string describing the game
     */
    @Override
    public String toString()
    {
        return "Game: " + title
             + " | Genre: " + genre
             + " | Rating: " + userRating;
    }
}