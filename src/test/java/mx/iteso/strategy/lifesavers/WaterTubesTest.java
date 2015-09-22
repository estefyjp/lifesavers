package mx.iteso.strategy.lifesavers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaterTubesTest {
	@Test
    public void testWaterTubes() {
		WaterTubes waterTubes = new WaterTubes();
        assertEquals("I'm deflating!", waterTubes.performDeflate());
        assertEquals("I'm inflating!", waterTubes.performInflate());
        assertEquals("I'm floating", waterTubes.performFloat());
        assertEquals("I can't sink", waterTubes.performSink());
        assertEquals("I'm a Water Tubes", waterTubes.display());
    }
}
