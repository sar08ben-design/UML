
public class StoryMode extends SinglePlayer
{
    private String chapterName;
    private int missionNumber;
    private boolean finalBossUnlocked;

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

    public void showChapter()
    {
        System.out.println("Current chapter: " + chapterName);
    }

    public void nextMission()
    {
        missionNumber++;
        System.out.println("Now on mission: " + missionNumber);
    }

    public void unlockFinalBoss()
    {
        finalBossUnlocked = true;
        System.out.println("Final boss unlocked!");
    }
}