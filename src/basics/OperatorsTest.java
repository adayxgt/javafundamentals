package basics;

import java.security.PrivateKey;

public class OperatorsTest {

	public static void main(String[] args) {

		arithmeticOperations();
		arithmeticOperations();
		arithmeticOperations();
		arithmeticOperations();

		
	}

	private static void arithmeticOperations() {
		// Declaring three variables of the same type
		float num1 = 10, num2 = 20.234f, num3;
		System.out.println(num1);
		num1 = 23.34f;
		System.out.println(num1);
		// addition
		float result = num1 + num2;
		System.out.println("the result is " + result);
		/**
		 * Operacion de resta 1 El CPU lee el valor de la variable "result" 2 Se realiza
		 * la resta con el numerto 1 3 Se guarda el resultado en la misma varable
		 * "result"
		 * 
		 * El orden de la operacion es de la derecha a la izquierda
		 */
		result = result - 1;
		System.out.println("the result is " + result);
		result -= 1;// Es lo mismo que "reslt = result - 1;"
		System.out.println("the result is " + result);
		// multiplication
		result = result * 2;
		System.out.println("the result is " + result);
		result *= 2;
		System.out.println("the result is " + result);
		// division
		result = result / num2;
		System.out.println("the result is " + result);
		result /= num2;
		System.out.println("the result is " + result);

	}

}
