/**
 * Represents a single-player game mode.
 * Extends Game with extra data such as seed, save world flag,
 * current level, and difficulty.
 *
 * @author Anuj
 * @version May 2026
 */
public class SinglePlayer extends Game
{
    private int seed;
    private boolean saveWorld;
    private int level;
    private String difficulty;

    /**
     * Creates a SinglePlayer game object.
     *
     * @param title the title of the game
     * @param genre the genre of the game
     * @param ageRating the age rating of the game
     * @param platform the platform of the game
     * @param userRating the user rating from 0 to 5
     * @param seed the random world seed
     * @param saveWorld true if the world should be saved, false otherwise
     * @param level the current level
     * @param difficulty the difficulty setting
     */
    public SinglePlayer(String title, Genre genre, AgeRating ageRating,
                        Platform platform, double userRating,
                        int seed, boolean saveWorld, int level, String difficulty)
    {
        super(title, genre, ageRating, platform, userRating);

        this.seed = seed;
        this.saveWorld = saveWorld;
        this.level = level;
        this.difficulty = difficulty;
    }

    /**
     * Loads the single-player game and prints its state.
     */
    public void loadGame()
    {
        System.out.println("Loading game: " + getTitle());
        System.out.println("Seed: " + seed);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Level: " + level);
    }

    /**
     * Saves the single-player game and prints save status.
     */
    public void saveGame()
    {
        System.out.println("Saving game: " + getTitle());
        System.out.println("World saved: " + saveWorld);
    }

    /**
     * Displays the current progress of the single-player game.
     */
    public void showProgress()
    {
        System.out.println("Game progress for " + getTitle());
        System.out.println("Current level: " + level);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Save world status: " + saveWorld);
    }

    /**
     * Compares this SinglePlayer game with another object.
     *
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SinglePlayer other = (SinglePlayer) o;
        return seed == other.seed
            && saveWorld == other.saveWorld
            && level == other.level
            && difficulty.equalsIgnoreCase(other.difficulty);
    }

    /**
     * Returns the hash code for this SinglePlayer game.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode()
    {
        return super.hashCode() + seed + level;
    }
}