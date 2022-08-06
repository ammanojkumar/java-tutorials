package io.mk.designpattern.creational.mobile.abstractfactoty;

import io.mk.designpattern.creational.os.factoty.MobileOS;
import io.mk.designpattern.creational.os.factoty.OSEnum;
import io.mk.designpattern.creational.processor.factory.MobileProcessor;
import io.mk.designpattern.creational.processor.factory.ProcessorEnum;

public interface MobileAbstractFactory {

	public abstract MobileOS getMobileOS(OSEnum operatingSystem);

	public abstract MobileProcessor getMobileProcessor(ProcessorEnum processor);
}
