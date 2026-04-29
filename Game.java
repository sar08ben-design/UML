import java.util.HashSet;

public abstract class Game {

    private AgeRating ageRating;
    private Genre genre;
    private Platform platform;
    private String name;
    private int gameId;
    private String developer;
    private String detail;

    public Game(AgeRating ageRating, Genre genre, Platform platform,
               String name, int gameId, String developer, String detail) {
        this.ageRating = ageRating;
        this.genre = genre;
        this.platform = platform;
        this.name = name;
        this.gameId = gameId;
        this.developer = developer;
        this.detail = detail;
    }

    public String getName() {
        return name; 
    }
    
    public int getGameId() {
        return gameId; 
    }
    
    public AgeRating getAgeRating() { 
        return ageRating; 
    }
    
    public Genre getGenre() { 
        return genre; 
    }
    
    public Platform getPlatform() {
        return platform; 
    }
    
    public String getDeveloper() {
        return developer; 
    }

    public String getDetail() {
        return detail; 
    }
}