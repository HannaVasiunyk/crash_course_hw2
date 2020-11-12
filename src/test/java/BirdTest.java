import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BirdTest {


    @Test
    public void testCreate() {
        Eagle eagle = new Eagle(true, true);

        assertNotNull(eagle);
        assertTrue(eagle.isFeathers());
        assertTrue(eagle.isLayEggs());

        Swallow swallow = new Swallow(false, false);

        assertNotNull(swallow);
        assertFalse(swallow.isFeathers());
        assertFalse(swallow.isLayEggs());

       Penguin penguin = new Penguin(true, true);

        assertNotNull(penguin);
        assertTrue(penguin.isFeathers());
        assertTrue(penguin.isLayEggs());

        Chicken chicken = new Chicken(true, true);

        assertNotNull(chicken);
        assertTrue(chicken.isFeathers());
        assertTrue(chicken.isLayEggs());


    }


    @Test
    public void testFly() {
        Eagle eagle = new Eagle(true, true);
        assertEquals("I can fly, I am eagle", eagle.fly());

        Swallow swallow = new Swallow(false, false);
        assertEquals("I can fly, I am swallow", swallow.fly());

        Penguin penguin = new Penguin(false, true);
        assertEquals("I can't fly, I am penguin", penguin.fly());

        Chicken chicken = new Chicken(true, true);
        assertEquals("I can't fly, I am chicken", chicken.fly());




    }
}
