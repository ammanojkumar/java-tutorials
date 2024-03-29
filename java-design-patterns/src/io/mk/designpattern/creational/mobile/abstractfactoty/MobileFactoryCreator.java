package io.mk.designpattern.creational.mobile.abstractfactoty;

enum MobileEnum {

	OPERATING_SYSTEM, PROCESSOR
}

public class MobileFactoryCreator {

	public static MobileAbstractFactory getMobileFactory(MobileEnum mobile) {
		switch (mobile) {
		case OPERATING_SYSTEM:
			return new MobileOSFactory();
		case PROCESSOR:
			return new MobileProcessorFactory();
		}
		return null;
	}
}
