
public interface Vehicle {
	
	/*
	 * Basic working of the Vehicle Class is the below 4 methods,
	 * 
	 * Any Vehicle is either
	 * 
	 * Workable i.e. does it's genre of work (w.r.t Engine/Driving Force)
	 * 
	 * Runnable i.e. runs on road/water/air/time (in case of Time Vehicle) etc
	 * 
	 * Stoppable i.e. Turning off the workable Engine/thrusters etc
	 * 
	 * Start-able i.e. Turning on the workable Engine/thrusters etc 
	 * 
	 */
	void work();
	
	void run();
	
	void stop();
	
	void start();
}
