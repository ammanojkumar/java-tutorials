package io.mk.designpattern.creational.processor.factory;

public class ProcessorSnapdragon implements MobileProcessor {

	@Override
	public String getCPUClockRate() {
		return "2.6 GHz";
	}

	@Override
	public String getLatestSerious() {
		return "Helio G90";
	}
}
