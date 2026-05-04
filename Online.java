

/**
 * Write a description of class h here.
 *
 * @author (Sarah)
 * @version (a version number or a date)
 */
public class Online extends MultiPlayer {
    
    private String severName;
    private int ping;
    private boolean connected;

    public Online(String title, Genre genre, AgeRating ageRating,
                  Platform platform, double userRating,
                  int seed, boolean saveWorld, int level, String difficulty)
    {
        super(title, genre, ageRating, platform, userRating,
              seed, saveWorld, level, difficulty);
      
    }

    public void connectServer() {
        connected = true;
        System.out.println("Connected to server: " + severName);
    }

    public void disconnectServer() {
        connected = false;
        System.out.println("Disconnected from server: " + severName);
    }

    public void checkPing() {
        System.out.println("Current ping: " + ping + " ms");
    }

    public String getSeverName()  {
        return severName;
    }
    
    public int getPing()          {
        return ping; 
    }
    
    public boolean isConnected()  {
        return connected; 
    }

    public void setSeverName(String severName) {
        this.severName = severName;
    }
    
    public void setPing(int ping)  { 
        this.ping = ping; 
    }
}