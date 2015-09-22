package mx.iteso.strategy.lifesavers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FoamFloatsTest {
	  @Test
	    public void testFoamFloats() {
		  FoamFloats foamFloats = new FoamFloats();
		  assertEquals("I can't deflate!", foamFloats.performDeflate());
	        assertEquals("I can't inflate!", foamFloats.performInflate());
	        assertEquals("I'm floating", foamFloats.performFloat());
	        assertEquals("I can't sink", foamFloats.performSink());
	        assertEquals("I'm a Foam floats", foamFloats.display());
	    }
}
