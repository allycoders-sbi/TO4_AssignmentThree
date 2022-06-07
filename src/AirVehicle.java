
public interface AirVehicle extends Vehicle{
	
	/***
	 * 
	 * An air vehicle thrusts and moves forward when it works.
	 * 
	 */
	
	void thrust();
	
	
	/*
	 * An air vehicle whenever in air or vacuum it falls freely under the influence of Gravity.
	 */
	void freeFall();
}
