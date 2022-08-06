package io.mk.designpattern.creational.os.factoty;

public interface MobileOS {

	public boolean isOpenSource();

	public String getLatestVersion();

	public int getAvailableAppsCount();
}
