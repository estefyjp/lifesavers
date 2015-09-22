package mx.iteso.strategy.lifesavers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ArmBandsTest {
	  @Test
	    public void testArmBands() {
		  ArmBands armBands = new ArmBands();
	        assertEquals("I'm deflating!", armBands.performDeflate());
	        assertEquals("I'm inflating!", armBands.performInflate());
	        assertEquals("I'm floating", armBands.performFloat());
	        assertEquals("I can't sink", armBands.performSink());
	        assertEquals("I'm a Arm bands", armBands.display());
	    }
}
