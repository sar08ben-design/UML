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
}
