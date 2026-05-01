

<<<<<<< Updated upstream
public class Local extends MultiPlayer{
=======
public class Local extends MultiPlayer
{
    // instance variables - replace the example below with your own
       public Local(String name, Genre g,Platform p, AgeRating a)
    {
        super(name,g,p,a);
     
    }

>>>>>>> Stashed changes
    
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