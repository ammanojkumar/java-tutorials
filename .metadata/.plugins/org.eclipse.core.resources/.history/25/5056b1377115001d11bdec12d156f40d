package io.mk.creational.designpattern.abstractfactoty;

public class MobileFactoryCreator {

	public static MobileAbstractFactory getMobileFactory(Mobile mobile) {
		switch (mobile) {
		case OPERATING_SYSTEM:
			return new MobileOSFactory();
		case PROCESSOR:
			return new MobileProcessorFactory();
		}
		return null;
	}
}
