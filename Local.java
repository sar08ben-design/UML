
/**
 * Represents a local multiplayer game.
 * Extends MultiPlayer with setup information for local matches.
 *
 * @author Sarah
 * @version May 2026
 */
public class Local extends MultiPlayer
{
    private int controllerCount;
    private boolean splitScreen;
    private String location;

    /**
     * Creates a Local multiplayer game object.
     *
     * @param title the title of the game
     * @param genre the genre of the game
     * @param ageRating the age rating of the game
     * @param platform the platform of the game
     * @param userRating the user rating from 0 to 5
     * @param partyMembers the number of party members
     * @param playerId the player ID
     * @param maxPlayer the maximum number of players
     * @param hostName the host name
     * @param controllerCount the number of controllers
     * @param splitScreen true if split-screen is enabled, false otherwise
     * @param location the match location
     */
    public Local(String title, Genre genre, AgeRating ageRating,
                 Platform platform, double userRating,
                 int partyMembers, String playerId, int maxPlayer, String hostName,
                 int controllerCount, boolean splitScreen, String location)
    {
        super(title, genre, ageRating, platform, userRating,
              partyMembers, playerId, maxPlayer, hostName);

        this.controllerCount = controllerCount;
        this.splitScreen = splitScreen;
        this.location = location;
    }

    /**
     * Starts the local match and displays setup information.
     */
    public void startLocalMatch()
    {
        System.out.println("Starting local match at: " + location);
        System.out.println("Controllers: " + controllerCount
                           + " | Split-screen: " + splitScreen);
    }

    /**
     * Ends the local match.
     */
    public void endLocalMatch()
    {
        System.out.println("Local match ended.");
    }

    /**
     * Displays the local multiplayer setup.
     */
    public void showSetup()
    {
        System.out.println("=== Local Setup ===");
        System.out.println("Location: " + location);
        System.out.println("Controllers: " + controllerCount);
        System.out.println("Split-screen: " + splitScreen);
    }

    /**
     * Returns the number of controllers.
     *
     * @return the number of controllers
     */
    public int getControllerCount()
    {
        return controllerCount;
    }

    /**
     * Returns whether split-screen is enabled.
     *
     * @return true if split-screen is enabled, false otherwise
     */
    public boolean isSplitScreen()
    {
        return splitScreen;
    }

    /**
     * Returns the match location.
     *
     * @return the location
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * Sets the number of controllers.
     *
     * @param controllerCount the new controller count
     */
    public void setControllerCount(int controllerCount)
    {
        if (controllerCount > 0){
            this.controllerCount = controllerCount;
        }
    }

    /**
     * Sets whether split-screen is enabled.
     *
     * @param splitScreen the new split-screen value
     */
    public void setSplitScreen(boolean splitScreen)
    {
        this.splitScreen = splitScreen;
    }

    /**
     * Sets the match location.
     *
     * @param location the new location
     */
    public void setLocation(String location)
    {
        this.location = location;
    }
}