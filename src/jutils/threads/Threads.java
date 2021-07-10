package jutils.threads;

import java.util.TimerTask;

public class Threads {

	/**
	 * Shortcut to the classic way of declaring and initializing a Thread instance
	 * @param runnable the block of code to run
	 * @return the Thread object which runs the Runnable argument
	 */
	public static Thread run(Runnable runnable) {
		Thread thread = new Thread(runnable);
		thread.start();
		return thread;
	}
	
	/**
	 * Creates a Runnable object which executes the TimerTask argument
	 * @param task the object to convert
	 * @return a Runnable instance
	 */
	public static Runnable convertTimerTask(TimerTask task) {
		return new Runnable() {
			@Override
			public void run() {
				task.run();
			}
		};
	}
}
