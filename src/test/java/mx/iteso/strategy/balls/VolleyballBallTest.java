package mx.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VolleyballBallTest {
	@Test
    public void testVolleyballBall() {
		VolleyballBall volleyballBall = new VolleyballBall();
        assertEquals("I'm bouncing normally!", volleyballBall.performBounce());
        assertEquals("I'm deflating!", volleyballBall.performDeflate());
        assertEquals("I'm inflating!", volleyballBall.performInflate());
        assertEquals("I'm floating", volleyballBall.performFloat());
        assertEquals("I can't sink", volleyballBall.performSink());
        assertEquals("Volleyball ball is rolling!", volleyballBall.roll());
    }
}
