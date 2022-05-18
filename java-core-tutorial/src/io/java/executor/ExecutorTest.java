package io.java.executor;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import io.java.util.IOUtil;

public class ExecutorTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		execute(executor);

		ExecutorService executor2 = Executors.newFixedThreadPool(3);
		execute(executor2);
	}

	private static void execute(ExecutorService executor) throws InterruptedException, ExecutionException {
		List<Runnable> someRunnables = IOUtil.getSomeRunnables(1000);
		List<Callable<String>> someCallables = IOUtil.getSomeCallables(1000);

		executor.execute(someRunnables.get(0));
		executor.submit(someRunnables.get(1));
		Future<String> future = executor.submit(someCallables.get(2));
		System.out.println("All execute/submit called");
		System.out.println(future.get());
		System.out.println("All execute/submit executed..");

		List<Future<String>> fuList = executor.invokeAll(someCallables);
		System.out.println("invokeAll called");
		fuList.forEach(retVal -> {
			try {
				System.out.println(retVal.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		});
		System.out.println("InvokeAll executed..");

		System.out.println(executor.invokeAny(IOUtil.getSomeCallables()));
		executor.shutdown();
		System.out.println("--------");

	}
}
