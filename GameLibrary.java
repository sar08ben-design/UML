import java.util.HashSet;


public class GameLibrary
{
        
    public HashSet<Game> library;   
    
    public GameLibrary()
    {
       library= new HashSet<>();
    }

    public void addGame(Game g){
        library.add(g);
    }
    
    public String gameName(Game g){
    return g.getName();
    }
    
    public Genre gameGenre(Game g){
    return g.getGenre();
    }
    
    public Platform gamePlateform(Game g){
    return g.getPlatform();
    }
    
    public AgeRating gameAgeRating(Game g){
    return g.getAgeRating();
    }
    
}
