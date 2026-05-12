import java.util.HashSet;

/**
 * Represents a multiplayer game.
 * This class extends Game and stores multiplayer information
 * such as party members, player ID, maximum players, and host name.
 *
 * @author Sarah
 * @version May 2026
 */
public class MultiPlayer extends Game
{
    private int partyMembers;
    private String playerId;
    private int maxPlayer;
    private String hostName;
    private HashSet<String> playerIds;

    /**
     * Creates a MultiPlayer game object.
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
     */
    public MultiPlayer(String title, Genre genre, AgeRating ageRating,
                       Platform platform, double userRating,
                       int partyMembers, String playerId, int maxPlayer, String hostName)
    {
        super(title, genre, ageRating, platform, userRating);
        this.partyMembers = partyMembers;
        this.playerId = playerId;
        this.maxPlayer = maxPlayer;
        this.hostName = hostName;
        this.playerIds = new HashSet<>();
    }

    /**
     * Displays all player IDs in the party.
     */
    public void listAllPlayer()
    {
        System.out.println("Players in party: " + playerIds);
    }

    /**
     * Removes a player ID from the party.
     *
     * @param id the player ID to remove
     */
    public void removePlayer(String id)
    {
        if (id == null || id.trim().isEmpty()){
            System.out.println("Invalid player ID.");
            
        }

        if (playerIds.contains(id)){
            playerIds.remove(id);
            partyMembers--;
            System.out.println("Player " + id + " removed.");
        }
        else{
            System.out.println("Player " + id + " not found.");
        }
    }

    /**
     * Adds a player ID to the party.
     *
     * @param id the player ID to add
     */
    public void addPlayerId(String id)
    {
        if (id == null || id.trim().isEmpty()){
            System.out.println("Invalid player ID.");
            return;
        }

        if (partyMembers >= maxPlayer){
            System.out.println("Party is full! Max players: " + maxPlayer);
            return;
        }

        if (!playerIds.add(id)){
            System.out.println("Player ID " + id + " is already taken!");
            return;
        }

        partyMembers++;
        System.out.println("Player " + id + " added.");
    }

    /**
     * Returns the number of party members.
     *
     * @return the number of party members
     */
    public int getPartyMembers()
    {
        return partyMembers;
    }

    /**
     * Returns the player ID.
     *
     * @return the player ID
     */
    public String getPlayerId()
    {
        return playerId;
    }

    /**
     * Returns the maximum number of players.
     *
     * @return the maximum number of players
     */
    public int getMaxPlayer()
    {
        return maxPlayer;
    }

    /**
     * Returns the host name.
     *
     * @return the host name
     */
    public String getHostName()
    {
        return hostName;
    }

    /**
     * Sets the player ID.
     *
     * @param playerId the new player ID
     */
    public void setPlayerId(String playerId)
    {
        this.playerId = playerId;
    }

    /**
     * Sets the maximum number of players.
     *
     * @param maxPlayer the maximum number of players
     */
    public void setMaxPlayer(int maxPlayer)
    {
        if (maxPlayer > 0){
            this.maxPlayer = maxPlayer;
        }
    }

    /**
     * Sets the host name.
     *
     * @param hostName the new host name
     */
    public void setHostName(String hostName)
    {
        this.hostName = hostName;
    }

    /**
     * Compares this multiplayer game with another object.
     *
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        if (!super.equals(o)){
            return false;
        }

        MultiPlayer other = (MultiPlayer) o;

        return partyMembers == other.partyMembers
            && maxPlayer == other.maxPlayer
            && playerId.equalsIgnoreCase(other.playerId)
            && hostName.equalsIgnoreCase(other.hostName);
    }

    /**
     * Returns the hash code for this multiplayer game.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode()
    {
        return super.hashCode() + partyMembers + maxPlayer;
    }
}