package threadsandparallelcalculation.searching;

import datastructure.User;

public class UserSearchingTest implements Runnable {

	private String target;

	private User[] clients;

	private int beginning = -1, end = -1;

	public UserSearchingTest(String target, User[] clients, int beginning2, int end1) {
		this.target = target;
		this.clients = clients;
		this.beginning = beginning2;
		this.end = end1;

		
	}

	public void run() {

		for (int i = beginning; i < end; i++) {
			if (clients[i].getUsername() == target) {
				System.out.println("id of the user is " + clients[i].getId());
			}
		}

	}
}
