
/**
 * Write a description of class h here.
 *
 * @author (Anuj)
 * @version (a version number or a date)
 */
public class SinglePlayer extends Game
{
    private int seed;
    private boolean saveWorld;
    private int level;
    private String difficulty;
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

    public void loadGame()
    {
        System.out.println("Loading game: " + getTitle());
        System.out.println("Seed: " + seed);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Level: " + level);
    }

    public void saveGame()
    {
        System.out.println("Saving game: " + getTitle());
        System.out.println("World saved: " + saveWorld);
    }

    public void showProgress()
    {
        System.out.println("Game progress for " + getTitle());
        System.out.println("Current level: " + level);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Save world status: " + saveWorld);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
    
        SinglePlayer other = (SinglePlayer) o;
        return seed == other.seed &&
               saveWorld == other.saveWorld &&
               level == other.level &&
               difficulty.equalsIgnoreCase(other.difficulty);
    }
}

