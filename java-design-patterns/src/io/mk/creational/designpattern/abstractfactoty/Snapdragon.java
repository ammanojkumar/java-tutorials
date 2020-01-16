package io.mk.creational.designpattern.abstractfactoty;

public class Snapdragon implements MobileProcessor {

	@Override
	public String getCPUClockRate() {
		return "2.6 GHz";
	}

	@Override
	public String getLatestSerious() {
		return "Helio G90";
	}
}
