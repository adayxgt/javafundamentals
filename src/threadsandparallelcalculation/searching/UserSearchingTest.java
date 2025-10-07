package threadsandparallelcalculation.searching;

import datastructure.User;

public class UserSearchingTest implements Runnable {

	private String target;

	private User[] clients;

	private int beginning = -1, end = -1;

	private Thread main;

	public UserSearchingTest(String target, User[] clients, int beginning2, int end1, Thread thread) {
		this.target = target;
		this.clients = clients;
		this.beginning = beginning2;
		this.end = end1;
		this.main = thread;

	}

	public void run() {

		for (int i = beginning; i < end; i++) {
			if (clients[i] != null && clients[i].getUsername().equals(target)) {
				System.out.println("id of the user is " + clients[i].getId());
				this.main.interrupt();
				break;
			}
		}

	}
}
