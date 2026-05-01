

public class MultiPlayer extends Game
{
<<<<<<< Updated upstream
    
   public MultiPlayer(AgeRating ar, Genre g, Platform p,
                        String name, int id, String dev, String detail,
                        int seed, boolean saveWorld, int level, String difficulty) {
        super(ar, g, p, name, id, dev, detail);
=======

    public MultiPlayer(String title, Genre genre, AgeRating ageRating,
                        Platform platform, double userRating,
                        int seed, boolean saveWorld, int level, String difficulty)
    {
        super(title, genre, ageRating, platform, userRating);
>>>>>>> Stashed changes
    }

    
}
