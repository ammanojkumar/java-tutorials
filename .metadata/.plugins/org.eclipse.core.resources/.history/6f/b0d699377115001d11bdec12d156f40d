package io.mk.creational.designpattern.abstractfactoty;

public class MobileOSFactory implements MobileAbstractFactory {

	public MobileOS getMobileOS(OperatingSystem osName) {
		switch (osName) {
		case ANDROID:
			return new Android();
		case WINDOWS:
			return new Windows();
		case MAC:
			return new MAC();
		}
		return null;
	}

	@Override
	public MobileProcessor getMobileProcessor(Processor processor) {
		return null;
	}
}
