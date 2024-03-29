package io.mk.designpattern.creational.os.factoty;

public class MobileOSFactory {

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
}
