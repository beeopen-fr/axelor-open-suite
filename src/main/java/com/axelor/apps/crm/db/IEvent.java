package com.axelor.apps.crm.db;

/**
 * Interface of Event package. Enum all static variable of packages.
 * 
 * @author dubaux
 * 
 */
public interface IEvent {


	/**
	 * Static event type select
	 */

	static final int CALL = 1;
	static final int MEETING = 2;
	static final int TASK = 3;
	static final int HOLIDAY = 4;
	static final int TICKET = 5;

	
}
