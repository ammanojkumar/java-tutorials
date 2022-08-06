package io.mk.creational.designpattern.abstractfactoty;

public class MobileProcessorFactory implements MobileAbstractFactory {

	@Override
	public MobileOS getMobileOS(OperatingSystem operatingSystem) {
		return null;
	}

	@Override
	public MobileProcessor getMobileProcessor(Processor processor) {
		switch (processor) {
		case SNAPDRAGON:
			return new Snapdragon();
		case MEDIATEK:
			return new Mediatek();
		case BIONIC:
			return new Bionic();
		}
		return null;

	}
}
