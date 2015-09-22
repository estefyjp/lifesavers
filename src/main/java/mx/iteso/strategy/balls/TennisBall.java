package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Float;
import mx.iteso.strategy.behaviors.impl.NormalBounce;


public class TennisBall extends Ball {
	public TennisBall(){
		bounceBehavior =  new NormalBounce();
        deflateBehavior = new NotDeflatable();
        type = "Tennis ball";
        floatInWaterBehavior = new Float();

	}

}
