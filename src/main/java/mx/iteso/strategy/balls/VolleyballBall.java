package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Float;
import mx.iteso.strategy.behaviors.impl.NormalBounce;


public class VolleyballBall extends Ball{
	public VolleyballBall(){
		bounceBehavior =  new NormalBounce();
        deflateBehavior = new Deflatable();
        type = "Volleyball ball";
        floatInWaterBehavior = new Float();

	}
	

}
