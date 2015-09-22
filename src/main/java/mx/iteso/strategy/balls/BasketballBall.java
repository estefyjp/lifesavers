package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Float;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class BasketballBall extends Ball{
	public BasketballBall(){
		bounceBehavior =  new NormalBounce();
        deflateBehavior = new Deflatable();
        type = "Basketball ball";
        floatInWaterBehavior = new Float();

	}

}
