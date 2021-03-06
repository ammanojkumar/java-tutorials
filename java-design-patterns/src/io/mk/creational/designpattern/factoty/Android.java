package io.mk.creational.designpattern.factoty;

public class Android implements MobileOS {

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
