package io.mk.designpattern.creational.mobile.abstractfactoty;

import io.mk.designpattern.creational.os.factoty.MobileOS;
import io.mk.designpattern.creational.os.factoty.OSEnum;
import io.mk.designpattern.creational.processor.factory.MobileProcessor;
import io.mk.designpattern.creational.processor.factory.ProcessorBionic;
import io.mk.designpattern.creational.processor.factory.ProcessorEnum;
import io.mk.designpattern.creational.processor.factory.ProcessorMediatek;
import io.mk.designpattern.creational.processor.factory.ProcessorSnapdragon;

public class MobileProcessorFactory implements MobileAbstractFactory {

	@Override
	public MobileOS getMobileOS(OSEnum operatingSystem) {
		return null;
	}

	@Override
	public MobileProcessor getMobileProcessor(ProcessorEnum processor) {
		switch (processor) {
		case SNAPDRAGON:
			return new ProcessorSnapdragon();
		case MEDIATEK:
			return new ProcessorMediatek();
		case BIONIC:
			return new ProcessorBionic();
		}
		return null;
	}
}
