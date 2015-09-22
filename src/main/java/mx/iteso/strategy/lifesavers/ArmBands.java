package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Float;

public class ArmBands extends Lifesaver{
    public ArmBands() {
        type = "Arm bands";
        floatInWaterBehavior = new Float();
        deflateBehavior = new Deflatable();

    }
}
