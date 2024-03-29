package io.mk.designpattern.creational.os.factoty;

public class OSWindows implements MobileOS {

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
