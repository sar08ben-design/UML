

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MultiPlayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MultiPlayerTest
{
    MultiPlayer multiPla4;
    MultiPlayer multiPla3;
    MultiPlayer multiPla2;
    MultiPlayer multiPla1;
    
    /**
     * Default constructor for test class MultiPlayerTest
     */
    public MultiPlayerTest()
    {   multiPla1 = new MultiPlayer("Dg", Genre.ACTION, AgeRating.E,
        Platform.PC, 3.1, 3, "1234", 4, "ImHost");
        
      multiPla2 = new MultiPlayer("Dg", Genre.HORROR, AgeRating.M,
        Platform.XBOX, 3.1, 3, "1234", 4, "ImHost");
        
        multiPla3 = new MultiPlayer("Dg", Genre.ADVENTURE, AgeRating.E10,
        Platform.PC, 3.1, 3, "1234", 4, "ImHost");
     
       multiPla4 = new MultiPlayer("Dg", Genre.STRATEGY, AgeRating.E10,
        Platform.MOBILE, 3.1, 3, "1234", 4, "ImHost");
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
     
       
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
    public void host()
    {
     
       multiPla4.getHostName();
      assertSame("ImHost", multiPla4.getHostName());
    }
}

