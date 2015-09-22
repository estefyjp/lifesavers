package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FloatInWaterBehavior;

public abstract class Lifesaver {
    public String type;
    public DeflateBehavior deflateBehavior;
    public FloatInWaterBehavior floatInWaterBehavior;


    public String performInflate() {
        return deflateBehavior.inflate();
    }
    public String performDeflate() {
        return deflateBehavior.deflate();
    }
    public String performFloat(){
    	return floatInWaterBehavior.Floats();
    }
    public String performSink(){
    	return floatInWaterBehavior.Sink();
    }
    public String display() {
        return "I'm a " + type;
    }
}
