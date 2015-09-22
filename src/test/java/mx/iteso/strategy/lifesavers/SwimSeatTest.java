package mx.iteso.strategy.lifesavers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SwimSeatTest {
	@Test
    public void testSwimSeat() {
		SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm deflating!", swimSeat.performDeflate());
        assertEquals("I'm inflating!", swimSeat.performInflate());
        assertEquals("I'm floating", swimSeat.performFloat());
        assertEquals("I can't sink", swimSeat.performSink());
        assertEquals("I'm a Swim seat", swimSeat.display());
    }
}
