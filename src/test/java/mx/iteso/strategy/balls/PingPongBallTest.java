package mx.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PingPongBallTest {
	@Test
    public void testPingPongBall() {
		PingPongBall pingPong = new PingPongBall();
        assertEquals("I'm bouncing normally!", pingPong.performBounce());
        assertEquals("I can't deflate!", pingPong.performDeflate());
        assertEquals("I can't inflate!", pingPong.performInflate());
        assertEquals("I'm floating", pingPong.performFloat());
        assertEquals("I can't sink", pingPong.performSink());
        assertEquals("PingPong ball is rolling!", pingPong.roll());
    }
}
