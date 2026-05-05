/**
 * Represents a story mode for a single-player game.
 * Extends SinglePlayer with chapter, mission, and final boss status.
 *
 * @author Anuj
 * @version May 2026
 */
public class StoryMode extends SinglePlayer
{
    private String chapterName;
    private int missionNumber;
    private boolean finalBossUnlocked;

    /**
     * Creates a StoryMode game object.
     *
     * @param title the title of the game
     * @param genre the genre of the game
     * @param ageRating the age rating of the game
     * @param platform the platform of the game
     * @param userRating the user rating from 0 to 5
     * @param seed the random world seed
     * @param saveWorld true if the world should be saved, false otherwise
     * @param level the current level
     * @param difficulty the difficulty setting
     * @param chapterName the current chapter name
     * @param missionNumber the current mission number
     * @param finalBossUnlocked true if the final boss is unlocked
     */
    public StoryMode(String title, Genre genre, AgeRating ageRating,
                     Platform platform, double userRating,
                     int seed, boolean saveWorld, int level, String difficulty,
                     String chapterName, int missionNumber, boolean finalBossUnlocked)
    {
        super(title, genre, ageRating, platform, userRating,
              seed, saveWorld, level, difficulty);

        this.chapterName = chapterName;
        this.missionNumber = missionNumber;
        this.finalBossUnlocked = finalBossUnlocked;
    }

    /**
     * Displays the current chapter name.
     */
    public void showChapter()
    {
        System.out.println("Current chapter: " + chapterName);
    }

    /**
     * Moves to the next mission and prints the new mission number.
     */
    public void nextMission()
    {
        missionNumber++;
        System.out.println("Now on mission: " + missionNumber);
    }

    /**
     * Unlocks the final boss and prints a message.
     */
    public void unlockFinalBoss()
    {
        finalBossUnlocked = true;
        System.out.println("Final boss unlocked!");
    }

    /**
     * Returns a string representation of this StoryMode instance.
     *
     * @return a string describing the StoryMode
     */
    @Override
    public String toString()
    {
        return super.toString()
            + ", StoryMode{"
            + "chapterName='" + chapterName + '\''
            + ", missionNumber=" + missionNumber
            + ", finalBossUnlocked=" + finalBossUnlocked
            + '}';
    }
}