package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Sink;

public class LifesaversCandies extends Lifesaver{
    public LifesaversCandies() {
        type = "Lifesavers Candies";
        floatInWaterBehavior = new Sink();
        deflateBehavior = new NotDeflatable();
    }  

}
