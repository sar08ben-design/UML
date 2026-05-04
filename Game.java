import java.util.HashSet;

/**
 * Write a description of class h here.
 *
 * @author (Sarah, Anuj)
 * @version (a version number or a date)
 */
public class Game {

    private String title;
    private Genre genre;
    private AgeRating ageRating;
    private Platform platform;
    
    private double userRating;     
    private boolean inProgress;

    public Game(String title, Genre genre, AgeRating ageRating,
                Platform platform, double userRating) {
        this.title = title;
        this.genre = genre;
        this.ageRating = ageRating;
        this.platform = platform;
        this.userRating = userRating;
        this.inProgress = false;
    }

    public void startGame() {
        inProgress = true;
        System.out.println("Starting game: " + title);
    }

    public void showDetail() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Age rating: " + ageRating);
        System.out.println("Platform: " + platform);
        System.out.println("User rating: " + userRating);
        System.out.println("In progress: " + inProgress);
    }

    public void updateRating(double newRating) {
        if (newRating < 0 || newRating > 5) {
            System.out.println("Invalid rating (0–5).");
            return;
            
        }
        this.userRating = newRating;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public AgeRating getAgeRating() {
        return ageRating;
    }

    public Platform getPlatform() {
        return platform;
    }

    public double getUserRating() {
        return userRating;
    }
    
    public String getName() {   
        return title;           
    }
    
    @Override
    public boolean equals(Object o) {
        Game other = (Game) o;
        return title.equalsIgnoreCase(other.title) && platform == other.platform;
    }
    
    @Override
    public int hashCode() {
        return title.toLowerCase().hashCode() + platform.hashCode();
    }
    
    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", ageRating=" + ageRating +
                ", platform=" + platform +
                ", userRating=" + userRating +
                ", inProgress=" + inProgress +
                '}';
    }
}
