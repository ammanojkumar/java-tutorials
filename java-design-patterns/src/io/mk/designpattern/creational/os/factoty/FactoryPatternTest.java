package io.mk.designpattern.creational.os.factoty;

import java.util.Arrays;

public class FactoryPatternTest {

	public static void main(String[] args) {
		MobileOSFactory mobileOSFactory = new MobileOSFactory();

		Arrays.stream(OSEnum.values()).forEach(operatingSystem -> {
			MobileOS mobileOS = mobileOSFactory.getMobileOS(operatingSystem);
			System.out.println("Operating System: " + operatingSystem);
			System.out.println("Latest Version: " + mobileOS.getLatestVersion());
			System.out.println("Open Source: " + mobileOS.isOpenSource());
			System.out.println("Available Apps Count: " + mobileOS.getAvailableAppsCount() + "\n");
		});
	}
}
