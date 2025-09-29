package threadsandparallelcalculation;

/**
 * 
 * @author tanku Sep 12, 2025
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		Airport airport = new Airport();
		airport.setCounter(1);
		
		Thread machine1 = new Thread(new EntranceRegistrationTask(airport));
		
		machine1.start();
		
		Thread machine2 = new Thread(new EntranceRegistrationTask(airport)); 
	
		machine2.start();
	
		System.out.println("the people left in the airport ar");
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		
		Thread exitMachine1 = new Thread(new ExitRegistrationTask(airport));
		exitMachine1.start();
		
		Thread exitMachine2 = new Thread(new ExitRegistrationTask(airport));
		exitMachine2.start();
		try {
		
		Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
			System.out.println(airport.getCounter());
			System.out.println(Runtime.getRuntime().availableProcessors());
			
		}	
	}
}	