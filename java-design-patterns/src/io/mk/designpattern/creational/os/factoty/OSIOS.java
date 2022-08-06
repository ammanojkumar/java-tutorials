package io.mk.designpattern.creational.os.factoty;

public class OSIOS implements MobileOS {

	@Override
	public boolean isOpenSource() {
		return false;
	}

	@Override
	public String getLatestVersion() {
		return "v6";
	}

	@Override
	public int getAvailableAppsCount() {
		return 320000;
	}

}
