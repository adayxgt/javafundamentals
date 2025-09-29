package threadsandparallelcalculation.searching;

import datastructure.User;

//1 Crea un array de usuario y inicia con valores
//2 Usamos multiples hilos para encontrar un usuario concreto

public class SearchingTest {
	public static void main(String[] args) {
		
		User u;
		
		//Un array
			User[] clients = new User[4];
		 	for (int i = 0; i < clients.length; i++) {
		 		clients[i] = new User(i, "amno" + i, "pas" + i, false, 0);
		}
		 	
	}
	

}
