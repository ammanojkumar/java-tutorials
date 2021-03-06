package io.mk.creational.designpattern.abstractfactoty;

public class Bionic implements MobileProcessor {

	@Override
	public String getCPUClockRate() {
		return "2.39 GHz";
	}

	@Override
	public String getLatestSerious() {
		return "A11";
	}
}
