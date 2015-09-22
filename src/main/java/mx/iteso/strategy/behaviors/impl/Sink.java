package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FloatInWaterBehavior;


public class Sink implements FloatInWaterBehavior{
	public String Floats() {
		return "I can't float";
	}

	public String Sink() {
		return "I'm sinking";
	}

}