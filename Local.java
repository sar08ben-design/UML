public class Local extends MultiPlayer {
    
    
    private int controllerCount;
    
    private boolean splitScreen;
    private String location;

    public Local(String title, Genre genre, AgeRating ageRating,
                 Platform platform, double userRating,
                 int seed, boolean saveWorld, int level, String difficulty)
    {
        super(title, genre, ageRating, platform, userRating,
              seed, saveWorld, level, difficulty);
        
    }

    public void startLocalMatch() {
        System.out.println("Starting local match at: " + location);
        System.out.println("Controllers: " + controllerCount + 
                           " | Split-screen: " + splitScreen);
    }

    public void endLocalMatch() {
        System.out.println("Local match ended.");
    }

    public void showSetup() {
        System.out.println("=== Local Setup ===");
        System.out.println("Location: " + location);
        System.out.println("Controllers: " + controllerCount);
        System.out.println("Split-screen: " + splitScreen);
    }

    public int getControllerCount()  { return controllerCount; }
    
    public boolean isSplitScreen()   { return splitScreen; }
    
    public String getLocation()      { return location; }

    public void setControllerCount(int controllerCount)
    { this.controllerCount = controllerCount; }
    public void setSplitScreen(boolean splitScreen)  
    { this.splitScreen = splitScreen; }
    public void setLocation(String location)         
    { this.location = location; }
}