package com.in28minutes.micorservices.limitservices.bean;

public class LimitsConfiguration {

	private int minimum;
	private int maximum;

	public LimitsConfiguration(int minimum, int maximum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

}
