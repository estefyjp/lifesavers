package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FloatInWaterBehavior;

public abstract class Ball {
	//
    protected BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public String type;
    public FloatInWaterBehavior floatInWaterBehavior;

    //
    public Ball() {
    }
    //
    public void setBehavior(BounceBehavior bounceBehavior){
    	this.bounceBehavior = bounceBehavior;
    }
    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }
    //////////////////////////
    public String performFloat(){
    	return floatInWaterBehavior.Floats();
    }
    public String performSink(){
    	return floatInWaterBehavior.Sink();
    }

}
