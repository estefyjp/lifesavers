package mx.iteso.strategy.lifesavers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SwimRingTest {
	@Test
    public void testSwimRing() {
		SwimRing swimRing = new SwimRing();
		assertEquals("I'm deflating!", swimRing.performDeflate());
        assertEquals("I'm inflating!", swimRing.performInflate());
        assertEquals("I'm floating", swimRing.performFloat());
        assertEquals("I can't sink", swimRing.performSink());
        assertEquals("I'm a Swim ring", swimRing.display());
    }
}
