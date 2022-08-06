package io.mk.designpattern.creational.processor.factory;

public class MobileProcessorFactory {

	public MobileProcessor getMobileProcessor(ProcessorEnum processor) {
		switch (processor) {
		case SNAPDRAGON:
			return new ProcessorSnapdragon();
		case MEDIATEK:
			return new ProcessorMediatek();
		case BIONIC:
			return new ProcessorBionic();
		}
		return null;

	}
}
