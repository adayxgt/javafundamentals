package threadsandparallelcalculation.deadlock;

import java.security.PublicKey;
import java.time.Duration;

public class DeadLockTask {

	//Any instance of a class can be used as a lock to protect shared resources
	Object lock1 = new Object();
	Object lock2 = new Object();
	Integer lock3 = 3;

	//protected resource 1
	//protected by lock1
	private float balance = 1;
	//protected resource 2
	//protected by lock2
	private int stock = 10;

	public void task1() {
		synchronized (lock1) {
			
			

			
			if (stock <= 0) {
				return;

			}
			deductStock();

			
			try {
				Thread.sleep(Duration.ofMillis(100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (lock2) {
				System.out.println("task 1 protected by lock2 starts by thread name" + Thread.currentThread().getName());
				deduct();
				System.out.println("task 1 protected by lock2 has finished by thread name" + Thread.currentThread().getName());
			}
			
			System.out.println("task 1 protected by lock1 has finished by thread name" + Thread.currentThread().getName());
		}
	}

	public void task2() {
		synchronized (lock1) {
			System.out.println("task 1, the current thread name" + Thread.currentThread().getName());
			synchronized (lock2) {
				System.out.println("task 1 protected by lock2 starts by thread name" + Thread.currentThread().getName());
				deduct();
				System.out.println("task 1 protected by lock2 has finished by thread name" + Thread.currentThread().getName());
			}
			
			System.out.println("task 1 protected by lock2 has finished by thread name" + Thread.currentThread().getName());
			
		}
	}

	public void task3() {
		synchronized (lock3) {
			System.out.println("task 3, the curent thread name" + Thread.currentThread().getName());
			//una pausa
			try {
				Thread.sleep(Duration.ofMillis(100));
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("task 3 has finished, the curent thread name" + Thread.currentThread().getName());
		}
	}
	
	public void task4() {
			System.out.println("task 3 starts, the curent thread name" + Thread.currentThread().getName());
			//una pausa
			try {
				Thread.sleep(Duration.ofMillis(100));
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("task 3 has finished, the curent thread name" + Thread.currentThread().getName());
	}
	private void deduct() {
		System.out.println("deduct balance");
		balance--;
	}

	private void deductStock() {
		System.out.println("deduct stock");
		stock--;
	}

}
