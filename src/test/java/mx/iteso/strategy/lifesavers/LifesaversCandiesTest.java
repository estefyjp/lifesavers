package mx.iteso.strategy.lifesavers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LifesaversCandiesTest {
	@Test
    public void testLifesaversCandies() {
		LifesaversCandies lifesaversCandies = new LifesaversCandies();
	  assertEquals("I can't deflate!", lifesaversCandies.performDeflate());
        assertEquals("I can't inflate!", lifesaversCandies.performInflate());
        assertEquals("I can't float", lifesaversCandies.performFloat());
        assertEquals("I'm sinking", lifesaversCandies.performSink());
        assertEquals("I'm a Lifesavers Candies", lifesaversCandies.display());
    }
}
