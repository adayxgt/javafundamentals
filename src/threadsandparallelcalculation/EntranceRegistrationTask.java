package threadsandparallelcalculation;

public class EntranceRegistrationTask implements Runnable {

	private Airport airport;

	public EntranceRegistrationTask(Airport airport2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Start the task");
		try {
			System.out.println("The thread name is" + Thread.currentThread().getName());
			System.out.println("The thread " + Thread.currentThread().getName() + " has entered the sleep mode");
			Thread.sleep(2000);
			for (int i = 0; i < 1000; i++) {
				airport.decrease();

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The task is finished");

	}

}
