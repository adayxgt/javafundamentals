package threadsandparallelcalculation;

import java.security.PublicKey;

public class Airport {

	private int counter = 0;

		
		/**counter = counter + 1;**/

	public synchronized void increment() {
		// Incrementar el valor de la variable de counter por uno
		counter++;/**
					 * Paso1.Leer el valor actual de la Variable "counter", la mete en la memoria.
					 * Paso2.Hacer la suma con el valor actual de "counter" con 1 Paso3.actualizar
					 * el valor guardado en la variable con el valor
					 **/
	}

	public void decrease() {
		// Decrecer el valor de la variable de counter por UNO

		synchronized (this) {
			counter--;
		}

	}

	private int getCounter() {
		return counter;
	}

	public void setCounter(int i) {
		// TODO Auto-generated method stub

	}
}
