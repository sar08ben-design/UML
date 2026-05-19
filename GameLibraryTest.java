

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameLibraryTest.
 *
 * @author  (Sarra)
 * @version (a version number or a date)
 */
public class GameLibraryTest
{
    GameLibrary gameLibr1;
    Game game1;
    Game game2;
    Game game3;
    Game game4;
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
        game1 = new Game("title", Genre.ACTION, AgeRating.E, Platform.PC, 2.2); 
        gameLibr1.addGame(game1);
        game2 = new Game("title2", Genre.ACTION, AgeRating.E, Platform.PC, 3.2);
        gameLibr1.addGame(game2);
        game3 = new Game("title3", Genre.ACTION, AgeRating.E, Platform.PC, 4.2);
        gameLibr1.addGame(game3);
        game4 = new Game("title4", Genre.ACTION, AgeRating.E, Platform.PC, 1.2);
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
    /**
     * Tests that searchs for the highest ranked game.
     */
    @Test
    public void checkTopGame()
    {
        assertEquals( "title3 has a 4.2 out of 5",gameLibr1.getTopGame());
    }
    
    /**
     * Tests that a game added to the library can be found by title.
     */
    @Test
    public void findGameByTitleFound()
    {
        assertEquals(game1, gameLibr1.findGameByTitle("title"));
    }
    
    /**
     * Tests that searching for a title that does not exist returns null.
     */
    @Test
    public void findGameByTitleNotFound()
    {
        assertNull(gameLibr1.findGameByTitle("Halo"));
    }
    
    /**
     * Tests that removing a game actually removes it from the library.
     * After removal, findGameByTitle should return null.
     */
    @Test
    public void removeGameWorks()
    {
        gameLibr1.removeGame(game1);
        assertNull(gameLibr1.findGameByTitle("title"));
    }
    
    /**
     * Tests that a game that was NOT removed is still in the library.
     */
    @Test
    public void removeGameKeepsOthers()
    {
        gameLibr1.removeGame(game1);
        assertEquals(game2, gameLibr1.findGameByTitle("title2"));
    }
}

