package mx.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BaseballBallTest {
	@Test
    public void testBaseballBall() {
        BaseballBall baseballBall = new BaseballBall();
        assertEquals("I'm bouncing irregularly!", baseballBall.performBounce());
        assertEquals("I can't deflate!", baseballBall.performDeflate());
        assertEquals("I can't inflate!", baseballBall.performInflate());
        assertEquals("I'm floating", baseballBall.performFloat());
        assertEquals("I can't sink", baseballBall.performSink());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
    }
}
