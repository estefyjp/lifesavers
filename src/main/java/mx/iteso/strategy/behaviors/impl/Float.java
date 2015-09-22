package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FloatInWaterBehavior;


public class Float implements FloatInWaterBehavior{
	public String Floats() {
		return "I'm floating";
	}

	public String Sink() {
		return "I can't sink";
	}

}
