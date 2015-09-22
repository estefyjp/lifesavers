package mx.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SoccerBallTest {
	@Test
    public void testSoccerBall() {
		SoccerBall soccerballBall = new SoccerBall();
        assertEquals("I'm bouncing normally!", soccerballBall.performBounce());
        assertEquals("I'm deflating!", soccerballBall.performDeflate());
        assertEquals("I'm inflating!", soccerballBall.performInflate());
        assertEquals("I'm floating", soccerballBall.performFloat());
        assertEquals("I can't sink", soccerballBall.performSink());
        assertEquals("Soccer ball is rolling!", soccerballBall.roll());
    }
}
