package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Sink;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class GolfBall extends Ball{
	public GolfBall(){
		bounceBehavior =  new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        type = "Golf ball";
        floatInWaterBehavior = new Sink();

		
	}

}
