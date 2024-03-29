package io.mk.designpattern.creational.mobile.abstractfactoty;

import java.util.Arrays;

import io.mk.designpattern.creational.os.factoty.MobileOS;
import io.mk.designpattern.creational.os.factoty.OSEnum;
import io.mk.designpattern.creational.processor.factory.MobileProcessor;
import io.mk.designpattern.creational.processor.factory.ProcessorEnum;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {

		Arrays.stream(MobileEnum.values()).forEach(mobile -> {
			MobileAbstractFactory mobileFactory = MobileFactoryCreator.getMobileFactory(mobile);

			if (mobileFactory instanceof MobileOSFactory) {
				System.out.println("Mobile operating system information...");
				Arrays.stream(OSEnum.values()).forEach(operatingSystem -> {
					MobileOS mobileOS = mobileFactory.getMobileOS(operatingSystem);
					System.out.println("Operating System: " + operatingSystem);
					System.out.println("Latest Version: " + mobileOS.getLatestVersion());
					System.out.println("Open Source: " + mobileOS.isOpenSource());
					System.out.println("Available Apps Count: " + mobileOS.getAvailableAppsCount() + "\n");
				});

			} else if (mobileFactory instanceof MobileProcessorFactory) {
				System.out.println("Mobile processor information...");
				Arrays.stream(ProcessorEnum.values()).forEach(processor -> {
					MobileProcessor mobileProcessor = mobileFactory.getMobileProcessor(processor);
					System.out.println("Processor: " + processor);
					System.out.println("Latest Serious: " + mobileProcessor.getLatestSerious());
					System.out.println("CPU Clock Rate: " + mobileProcessor.getCPUClockRate() + "\n");
				});
			}
		});
	}
}
