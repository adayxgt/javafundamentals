package threadsandparallelcalculation.searching;

import datastructure.User;


public class SearchingTest {
	public static void main(String[] args) {

		// El nombre que queremos examinar si existe en el array de usuarios
		String targetName = "Aday";
		System.out.println("Aday" == targetName);

		User[] clients = new User[20000000];
		for (int i = 0; i < clients.length; i++) {
			clients[i] = new User(i, "Aday" + i, "pass" + i, false, 0);
		}

		long starTime = System.currentTimeMillis();
		searchWithOneThread(targetName, clients);
		long endTime = System.currentTimeMillis();
		System.out.println("el tiempo usado por el metodo con un solo hilo es " + (endTime - starTime));
		
		starTime = System.currentTimeMillis();
		searchingWitchMultipleThreads(targetName, clients);
		endTime = System.currentTimeMillis();
		try {
			/**
			 * El hilo min entra el modo de sleep, va a ser despertado por
			 * otro hilo cuando este haya encontrado
			 */
					Thread.sleep(1000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		endTime = System.currentTimeMillis();
		System.out.println("el tiempo usado por el metodo con mutiples hilos es " + (endTime - starTime));
		
		
		
		for (int i = 0; i < clients.length; i++) {
			if (clients[i].getUsername() == targetName) {
				System.out.println("id of the user is " + clients[i]);
			}
		}

	}

	private static void searchingWitchMultipleThreads(String target, User[] clients) {
		int index = clients.length / 4;
//		Thread thread1 =
//				new Thread(new UserSearchingTest(target, clients, 0, index));
//		Thread thread2 =
//				new Thread(new UserSearchingTest(target, clients, index, 2 * index));
//		Thread thread3 =
//				new Thread(new UserSearchingTest(target, clients, 2 * index, 3 * index));
//		Thread thread4 =
//				new Thread(new UserSearchingTest(target, clients, 3 * index, 4 * index));
//
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		for (int i = 0; i < numOfThreads; i++) {
			Thread thread5 =
					new Thread(new UserSearchingTest(target, clients, i * index, i * index + index, Thread.currentThread()));
		thread5.start(); 
		
		
		}
		
		// TODO Auto-generated method stub

	}

	private static void searchWithOneThread(String targetName, User[] clients) {

		for (int i = 0; i < clients.length; i++) {
			if (clients[i].getUsername().equals(targetName)) {
				System.out.println("id of the user is " + clients[i].getId());
			}

		}
	}
}