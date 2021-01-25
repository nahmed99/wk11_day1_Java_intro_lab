import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    Planet saturn;

    @Before
    public void before() {
        saturn = new Planet("Saturn", 881278787);
    }

    @Test
    public void hasName() {
        assertEquals("Saturn", saturn.getName());
    }

    @Test
    public void hasSize() {
        assertEquals(881278787, saturn.getSize());
    }
}
