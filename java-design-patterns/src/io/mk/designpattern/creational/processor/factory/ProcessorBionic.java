package io.mk.designpattern.creational.processor.factory;

public class ProcessorBionic implements MobileProcessor {

	@Override
	public String getCPUClockRate() {
		return "2.39 GHz";
	}

	@Override
	public String getLatestSerious() {
		return "A11";
	}
}
