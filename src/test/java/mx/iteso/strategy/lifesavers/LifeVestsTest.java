package mx.iteso.strategy.lifesavers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LifeVestsTest {
	@Test
    public void testLifeVests() {
		LifeVests lifeVests = new LifeVests();
	  assertEquals("I can't deflate!", lifeVests.performDeflate());
        assertEquals("I can't inflate!", lifeVests.performInflate());
        assertEquals("I'm floating", lifeVests.performFloat());
        assertEquals("I can't sink", lifeVests.performSink());
        assertEquals("I'm a Life vests", lifeVests.display());
    }
}
