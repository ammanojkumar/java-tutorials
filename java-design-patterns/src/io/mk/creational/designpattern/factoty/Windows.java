package io.mk.creational.designpattern.factoty;

public class Windows implements MobileOS {

	@Override
	public boolean isOpenSource() {
		return true;
	}

	@Override
	public String getLatestVersion() {
		return "v12";
	}

	@Override
	public int getAvailableAppsCount() {
		return 30000;
	}

}
