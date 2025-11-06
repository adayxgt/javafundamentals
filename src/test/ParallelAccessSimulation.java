package test;

import java.util.ArrayList;

public class ParallelAccessSimulation {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		long fromUserId = 10;
		long toUserId = 20;
		ArrayList<Thread> threads = new ArrayList<Thread>(100);
		System.out.println(threads.size());
		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(
					() -> {
						userDao.transfer(fromUserId, toUserId, 1);
					}
					);
			threads.add(thread);
		}
		
		for (Thread thread : threads) {
			
		}
	}
	
}
