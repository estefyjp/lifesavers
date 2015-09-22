package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Float;
import mx.iteso.strategy.behaviors.impl.NormalBounce;


public class PingPongBall extends Ball {
	public PingPongBall(){
		bounceBehavior =  new NormalBounce();
        deflateBehavior = new NotDeflatable();
        type = "PingPong ball";
        floatInWaterBehavior = new Float();

	}

}
