
public class Game
{
    //ENUM
    public Genre g; 
    public Plateform p;
    public AgeRating a;
    
    public String name;
    public Game(String name, Genre g, Plateform p, AgeRating a)
    {
        //enum
        this.g = g;
        this.p = p;
        this.a = a;
        
        this.name=name;
    }
    
    
    public String getName(){
        return name;
    }
    
    public Genre getGenre(){
        return g;
    }
    
    public Plateform getPlateform(){
        return p;
    }
    
    public AgeRating getAgeRating(){
        return a;
    }
    
}
