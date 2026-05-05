import java.util.HashSet;


/**
 * Write a description of class h here.
 *
 * @author (Sarah)
 * @version (a version number or a date)
 */

public class MultiPlayer extends Game
{
    private int partyMembers;
    private String playerId;
    private int maxPlayer;
    private String hostName;
    
    private HashSet<String> playerIds;

    public MultiPlayer(String title, Genre genre, AgeRating ageRating,
                        Platform platform, double userRating,
                        int seed, boolean saveWorld, int level, String difficulty)
    {
        super(title, genre, ageRating, platform, userRating);
       
        this.playerIds = new HashSet<>();
    }

    public void listAllPlayer() {
        System.out.println("Players in party: " + playerIds);
    }

    public void removePlayer(String id) {
        if (playerIds.contains(id)) {
            playerIds.remove(id);
            partyMembers--;
            System.out.println("Player " + id + " removed.");
        } else {
            System.out.println("Player " + id + " not found.");
        }
    }

    public void addPlayerId(String id) {
        if (partyMembers >= maxPlayer) {
            System.out.println("Party is full! Max players: " + maxPlayer);
            return;
        }
        if (!playerIds.add(id)) {
            System.out.println("Player ID " + id + " is already taken!");
            return;
        }
        partyMembers++;
        System.out.println("Player " + id + " added.");
    }

    public int getPartyMembers() { 
        return partyMembers;
    }
    
    public String getPlayerId()     {
        return playerId; 
    }
    
    public int getMaxPlayer()    { 
        return maxPlayer;
    }
    
    public String getHostName()  { 
        return hostName;
    }

    public void setPlayerId(String playerId)  {
        this.playerId = playerId;
    }
    
    public void setMaxPlayer(int maxPlayer)  {   
        this.maxPlayer = maxPlayer;
    }
    
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
    
        MultiPlayer other = (MultiPlayer) o;
        return partyMembers == other.partyMembers &&
               playerId == other.playerId &&
               maxPlayer == other.maxPlayer &&
               hostName.equalsIgnoreCase(other.hostName);
    }
}