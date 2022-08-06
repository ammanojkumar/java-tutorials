package io.mk.designpattern.creational.os.factoty;

public class OSAndroid implements MobileOS {

	@Override
	public boolean isOpenSource() {
		return true;
	}

	@Override
	public String getLatestVersion() {
		return "v10";
	}

	@Override
	public int getAvailableAppsCount() {
		return 550000;
	}

}
