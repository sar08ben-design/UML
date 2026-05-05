/**
 * Represents an online multiplayer game.
 * Extends MultiPlayer with server connection details.
 *
 * @author Sarah
 * @version May 2026
 */
public class Online extends MultiPlayer
{
    private String serverName;
    private int ping;
    private boolean connected;

    /**
     * Creates an Online multiplayer game object.
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
     * @param serverName the server name
     * @param ping the current ping in milliseconds
     * @param connected true if connected to the server, false otherwise
     */
    public Online(String title, Genre genre, AgeRating ageRating,
                  Platform platform, double userRating,
                  int partyMembers, String playerId, int maxPlayer, String hostName,
                  String serverName, int ping, boolean connected)
    {
        super(title, genre, ageRating, platform, userRating,
              partyMembers, playerId, maxPlayer, hostName);

        this.serverName = serverName;
        this.ping = ping;
        this.connected = connected;
    }

    /**
     * Connects to the game server.
     */
    public void connectServer()
    {
        connected = true;
        System.out.println("Connected to server: " + serverName);
    }

    /**
     * Disconnects from the game server.
     */
    public void disconnectServer()
    {
        connected = false;
        System.out.println("Disconnected from server: " + serverName);
    }

    /**
     * Displays the current ping.
     */
    public void checkPing()
    {
        System.out.println("Current ping: " + ping + " ms");
    }

    /**
     * Returns the server name.
     *
     * @return the server name
     */
    public String getServerName()
    {
        return serverName;
    }

    /**
     * Returns the current ping.
     *
     * @return the ping value
     */
    public int getPing()
    {
        return ping;
    }

    /**
     * Returns whether the game is connected to the server.
     *
     * @return true if connected, false otherwise
     */
    public boolean isConnected()
    {
        return connected;
    }

    /**
     * Sets the server name.
     *
     * @param serverName the new server name
     */
    public void setServerName(String serverName)
    {
        this.serverName = serverName;
    }

    /**
     * Sets the ping value.
     *
     * @param ping the new ping value
     */
    public void setPing(int ping)
    {
        if (ping >= 0){
            this.ping = ping;
        }
    }
}