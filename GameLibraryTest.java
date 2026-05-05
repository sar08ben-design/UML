

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameLibraryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GameLibraryTest
{
    GameLibrary gameLibr1;
    /**
     * Default constructor for test class GameLibraryTest
     */
    public GameLibraryTest()
    {
        gameLibr1 = new GameLibrary();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        Game game1 = new Game("title", Genre.ACTION, AgeRating.E, Platform.PC, 2.2); 
        gameLibr1.addGame(game1);
        Game game2 = new Game("title2", Genre.ACTION, AgeRating.E, Platform.PC, 3.2);
        gameLibr1.addGame(game2);
        Game game3 = new Game("title3", Genre.ACTION, AgeRating.E, Platform.PC, 4.2);
        gameLibr1.addGame(game3);
        Game game4 = new Game("title4", Genre.ACTION, AgeRating.E, Platform.PC, 1.2);
        gameLibr1.addGame(game4);
    }
    

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test()
    {
        assertEquals(4.2,gameLibr1.listTopGames());
    }
}

