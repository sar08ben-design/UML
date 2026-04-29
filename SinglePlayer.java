

public class SinglePlayer extends Game {

    private int seed;
    private boolean saveWorld;
    private int level;
    private String difficulty;

    public SinglePlayer(AgeRating ar, Genre g, Platform p,
                    String name, int id, String dev, String detail,
                     int seed, boolean saveWorld, int level, String difficulty) 
    {
        super(ar, g, p, name, id, dev, detail);
        this.seed = seed;
        this.saveWorld = saveWorld;
        this.level = level;
        this.difficulty = difficulty;
    }
    
}
