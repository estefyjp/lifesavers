package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Float;
import mx.iteso.strategy.behaviors.impl.Deflatable;

public class WaterTubes extends Lifesaver{
    public WaterTubes() {
        type = "Water Tubes";
        floatInWaterBehavior = new Float();
        deflateBehavior = new Deflatable();
    } 

}
