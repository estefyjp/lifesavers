package mx.iteso.strategy.lifesavers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SwimBeltsTest {
	@Test
    public void testSwimBelts() {
		SwimBelts swimBelts = new SwimBelts();
	  assertEquals("I can't deflate!", swimBelts.performDeflate());
        assertEquals("I can't inflate!", swimBelts.performInflate());
        assertEquals("I'm floating", swimBelts.performFloat());
        assertEquals("I can't sink", swimBelts.performSink());
        assertEquals("I'm a Swim Belts", swimBelts.display());
    }
}
