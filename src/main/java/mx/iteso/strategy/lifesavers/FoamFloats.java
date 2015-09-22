package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Float;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class FoamFloats extends Lifesaver{
    public FoamFloats() {
        type = "Foam floats";
        floatInWaterBehavior = new Float();
        deflateBehavior = new NotDeflatable();

    }
}
