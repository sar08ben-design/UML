
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
}

