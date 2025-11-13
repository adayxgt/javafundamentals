package threadsandparallelcalculation;

import java.util.concurrent.TimeUnit;

import threadsandparallelcalculation.Airport;

/**
 * Tareas paralela 1: En un aeropuerto, hay varias entradas, tenemos que
 * registrar las salidas y entradas de todas las personas.
 */

public class ParallelPack implements Runnable {

	private Airport airport;

	public ParallelPack(Airport airport) {
		this.airport = airport;

	}

	/**	
	 * * el metodo "run" es donde se define la tarea para un hilo
	 * 
	 */

	@Override
	public void run() {
		System.out.println("Start the task");
		// Thread.sleep(2000);
		System.out.println("The thread name is" + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
			System.out.println("The thread" + Thread.currentThread().getName() + "has entered sleep mode");
			
		for (int i = 0; i < 1000; i++) {
			airport.decrease();
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The task is finisehd");
	}

}
