package mx.iteso.strategy.behaviors.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SinkTest {
	 @Test
	    public void testSinkFloats() {
	        Sink sink = new Sink();
	        assertEquals("I can't float",sink.Floats());

	    }

	    @Test
	    public void testSinkSink() {
	    	Sink sink = new Sink();
	        assertEquals("I'm sinking",sink.Sink());

	    }
}
