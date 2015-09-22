package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.Float;


public class AmericanFootballBall extends Ball {
	public AmericanFootballBall() {
		//
        this.bounceBehavior =  new IrregularBounce();
        deflateBehavior = new Deflatable();
        type = "American Football ball";
        floatInWaterBehavior = new Float();
   }
}
