package datastructure;

public class ArrayTest {

	public static void main(String[] args) {
		//== operador de igualdad
		// = operador de establecer un valor a una variable
		System.out.println(1==1);
		
		
				
		int[] scores = {12, 123123, 435, 324};
		int sum = scores[0] + scores[1] + scores[2] + scores[3];
		System.out.println("t    he total score is" + sum);
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++); {
			int su = 324;
			totalScore = scores[i] + totalScore;
			System.out.println("the total score is" + totalScore);
		}
		System.out.println("the total score is" + totalScore);
		//Un array
		User[] clients = new User[2];
		//Store a user object at the first position of the array
		clients[0] = new User(0, "amno", "pas", false, 0);
		//Store a user object at the second position of the array
		clients[1] = new User(1, "amno", "pas", false, 0);
		//Imprimir la longitud del array
		System.out.println(scores.length);
		System.out.println("the length of the array clients " + clients.length);
		
 		for (int i = 0; i < clients.length; i++) {
 			clients[i] = new User(i, "amno" + i, "pas" + i, false, 0);
		}
 		
 		for (int i = 0; i < clients.length; i++) {
 			System.out.println(clients[i].getUsername());
		}
 		
 		//Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "booleans" is null
 		boolean[] booleans = null;
 		System.out.println(booleans.length);
 		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
 		User[] users = {new User(), new User(0, "amno", "pas", false, 0)};
 		System.out.println(users.length);
 		System.out.println(users[2]);
		
	}
}
