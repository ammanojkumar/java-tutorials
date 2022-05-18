package io.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class IOUtil {

	public static List<Runnable> getSomeRunnables(int sleep) {
		List<Runnable> rnList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			final int j = i;
			rnList.add(() -> {
				sleepit(sleep);
				System.out.println("I am " + j);
			});
		}
		return rnList;
	}

	public static List<Callable<String>> getSomeCallables(int... sleep) {
		List<Callable<String>> clList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			final int j = i;
			clList.add(() -> {
				sleepit(sleep);
				return "Returned " + j;
			});
		}
		return clList;
	}

	private static void sleepit(int... slp) {
		try {
			if (slp.length > 0 && slp[0] > 0)
				Thread.sleep(slp[0]);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
