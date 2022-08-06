package io.mk.designpattern.creational.processor.factory;

public class ProcessorMediatek implements MobileProcessor {

	@Override
	public String getCPUClockRate() {
		return "2.8 GHz";
	}

	@Override
	public String getLatestSerious() {
		return "845";
	}
}
