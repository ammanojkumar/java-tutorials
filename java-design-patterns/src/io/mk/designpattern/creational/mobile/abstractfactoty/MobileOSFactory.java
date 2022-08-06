package io.mk.designpattern.creational.mobile.abstractfactoty;

import io.mk.designpattern.creational.os.factoty.MobileOS;
import io.mk.designpattern.creational.os.factoty.OSAndroid;
import io.mk.designpattern.creational.os.factoty.OSEnum;
import io.mk.designpattern.creational.os.factoty.OSIOS;
import io.mk.designpattern.creational.os.factoty.OSWindows;
import io.mk.designpattern.creational.processor.factory.MobileProcessor;
import io.mk.designpattern.creational.processor.factory.ProcessorEnum;

public class MobileOSFactory implements MobileAbstractFactory {

	@Override
	public MobileOS getMobileOS(OSEnum operatingSystem) {
		switch (operatingSystem) {
		case ANDROID:
			return new OSAndroid();
		case WINDOWS:
			return new OSWindows();
		case MAC:
			return new OSIOS();
		}
		return null;
	}

	@Override
	public MobileProcessor getMobileProcessor(ProcessorEnum processor) {
		return null;
	}
}
