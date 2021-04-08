package jutils.threads;

public class Threads {

	public static void run(Runnable runnable) {
		new Thread(runnable).start();
	}
	
}
