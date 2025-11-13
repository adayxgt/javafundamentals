package threadsandparallelcalculation.deadlock;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeadLockTest {

	public static void main(String[] args) {

		DeadLockTask task = new DeadLockTask();

		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//		// ()->{}
//		for (int i = 0; i < 2; i++) {
//			executor.submit(() -> {
//				task.task4();
//			});
//		}

		for (int i = 0; i < 60; i++) {
			executor.submit(() -> {
				task.task1();

			});
		}
		for (int i = 0; i < 60; i++) {
			executor.submit(() -> {
				task.task2();

			});
		}
		
		try {
			executor.awaitTermination(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}