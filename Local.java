

<<<<<<< Updated upstream
public class Local extends MultiPlayer{
    
    public Local() {
=======
public class Local extends MultiPlayer
{
    public Local(String title, Genre genre, AgeRating ageRating,
                        Platform platform, double userRating,
                        int seed, boolean saveWorld, int level, String difficulty)
    {
        super(title, genre, ageRating, platform, userRating);
>>>>>>> Stashed changes
    }
}