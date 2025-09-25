/**
 * 
 */
package threadsandparallelcalculation;


/**
 * 
 * @author tanku Sep 12, 2025
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		Airport airport = new Airport();
		airport.setCounter(1);
		
		Thread thread1 = new Thread(new EntranceRegistrationTask(airport));
		
		thread1.start();
		
		Thread thread2 = new Thread(new EntranceRegistrationTask(airport)); 
	
		thread2.start();
	
		System.out.println("the people left in the airport ar");
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}	
