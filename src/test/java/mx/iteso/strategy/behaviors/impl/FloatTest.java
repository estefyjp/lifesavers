package mx.iteso.strategy.behaviors.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FloatTest {
	 @Test
	    public void testFloatFloats() {
	        Float floats = new Float();
	        assertEquals("I'm floating", floats.Floats());
	    }
	 @Test
	    public void testFloatSink() {
	        Float floats = new Float();
	        assertEquals("I can't sink", floats.Sink());
	    }
}
