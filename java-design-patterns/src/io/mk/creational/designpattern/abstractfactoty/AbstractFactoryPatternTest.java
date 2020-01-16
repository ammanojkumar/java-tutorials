package io.mk.creational.designpattern.abstractfactoty;

import java.util.Arrays;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {

		for (Mobile mobile : Arrays.asList(Mobile.values())) {
			MobileAbstractFactory mobileFactory = MobileFactoryCreator.getMobileFactory(mobile);

			if (mobileFactory instanceof MobileOSFactory) {
				for (OperatingSystem operatingSystem : Arrays.asList(OperatingSystem.values())) {
					MobileOS mobileOS = mobileFactory.getMobileOS(operatingSystem);
					System.out.println("Operating System: " + operatingSystem);
					System.out.println("Latest Version: " + mobileOS.getLatestVersion());
					System.out.println("Open Source: " + mobileOS.isOpenSource());
					System.out.println("Available Apps Count: " + mobileOS.getAvailableAppsCount() + "\n");
				}

			} else if (mobileFactory instanceof MobileProcessorFactory) {

				for (Processor processor : Arrays.asList(Processor.values())) {
					MobileProcessor mobileProcessor = mobileFactory.getMobileProcessor(processor);
					System.out.println("Processor: " + processor);
					System.out.println("Latest Serious: " + mobileProcessor.getLatestSerious());
					System.out.println("CPU Clock Rate: " + mobileProcessor.getCPUClockRate() + "\n");
				}
			}
		}
	}
}
