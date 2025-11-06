package user;

import datastructure.User;

public interface UserDaoInterface {
	
	/**
	 * Insertar in conjunto de usuarios en la base de datos
	 * @param users
	 * @return
	 */

	public int insertAll(User[] users);
		
	/**
	 * 
	 * @param fromUserId
	 * @param toUserId
	 * @param amount
	 * @return
	 */
	
	public boolean transfer(long fromUserId, long toUserId, float amount);
	
	/**
	 * 
	 * @param fromUserId
	 * @param toUserId
	 * @param amount
	 * @return
	 */
	
	public boolean transferWithBatch(long fromUserId, long toUserId, float amount);
}
