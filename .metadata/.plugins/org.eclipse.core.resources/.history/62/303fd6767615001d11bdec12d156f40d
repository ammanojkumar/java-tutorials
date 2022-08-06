package io.mk.creational.designpattern.singleton;

public class SingletonObject {

	private static SingletonObject singletonObject;

	private SingletonObject() {
	}

	public static synchronized SingletonObject getInstance() {
		if (singletonObject == null) {
			singletonObject = new SingletonObject();
		}
		return singletonObject;
	}
}
