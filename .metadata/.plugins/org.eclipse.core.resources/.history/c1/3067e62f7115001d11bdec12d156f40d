package io.mk.creational.designpattern.factoty;

public class MobileOSFactory {

	public MobileOS getMobileOS(OperatingSystem operatingSystem) {
		switch (operatingSystem) {
		case ANDROID:
			return new Android();
		case WINDOWS:
			return new Windows();
		case MAC:
			return new MAC();
		}
		return null;
	}
}
