package io.mk.creational.designpattern.abstractfactoty;

public interface MobileAbstractFactory {

	public abstract MobileOS getMobileOS(OperatingSystem operatingSystem);

	public abstract MobileProcessor getMobileProcessor(Processor processor);
}
