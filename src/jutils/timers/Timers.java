package jutils.timers;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timers {

	/**
	 * Schedules the given {@link TimerTask} after the specified mills
	 * 
	 * @param timerName the name of the timer
	 * @param delay specifies how many mills to wait before running the scheduled operation
	 * @param task the task to schedule
	 * @return the timer object used
	 */
	public static Timer schedule(String timerName, long delay, TimerTask task) {
		Timer timer = new Timer(timerName);
		
		timer.schedule(task, delay);
		
		return timer;
	}
	
	/**
	 * Schedules a new {@link TimerTask} based on the given {@link Runnable} and delay
	 * 
	 * @param timerName the name of the timer
	 * @param delay specifies how many mills to wait before running the scheduled operation
	 * @param runnable the runnable to run
	 * @return the timer object used
	 */
	public static Timer schedule(String timerName, long delay, Runnable runnable) {
		Timer timer = new Timer(timerName);
		
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				runnable.run();
			}
		}, delay);
		
		return timer;
	}
	
	/**
	 * Schedules the given {@link TimerTask} at the given {@link Date}
	 * 
	 * @param timerName the name of the timer
	 * @param date when to execute the operation
	 * @param task the task to schedule
	 * @return the timer object used
	 */
	public static Timer schedule(String timerName, Date date, TimerTask task) {
		Timer timer = new Timer(timerName);
		
		timer.schedule(task, date);
		
		return timer;
	}
	
	/**
	 * Schedules a new {@link TimerTask} based on the given {@link Runnable} at the given {@link Date}
	 * 
	 * @param timerName the name of the timer
	 * @param date when to execute the operation
	 * @param runnable the runnable to run
	 * @return the timer object used
	 */
	public static Timer schedule(String timerName, Date date, Runnable runnable) {
		Timer timer = new Timer(timerName);
		
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				runnable.run();
			}
		}, date);
		
		return timer;
	}
	
	/*
	 * Repeatable
	 */
	
	/**
	 * Schedules the given {@link TimerTask} after the specified mills
	 * 
	 * @param timerName the name of the timer
	 * @param delay specifies how many mills to wait before running the scheduled operation
	 * @param period specifies the interval between any execution
	 * @param task the task to schedule
	 * @return the timer object used
	 */
	public static Timer scheduleAtFixedRate(String timerName, long delay, long period, TimerTask task) {
		Timer timer = new Timer(timerName);
		
		timer.scheduleAtFixedRate(task, delay, period);
		
		return timer;
	}
	
	/**
	 * Schedules a new {@link TimerTask} based on the given {@link Runnable} and delay
	 * 
	 * @param timerName the name of the timer
	 * @param delay specifies how many mills to wait before running the scheduled operation
	 * @param period specifies the interval between any execution
	 * @param runnable the runnable to run
	 * @return the timer object used
	 */
	public static Timer scheduleAtFixedRate(String timerName, long delay, long period, Runnable runnable) {
		Timer timer = new Timer(timerName);
		
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				runnable.run();
			}
		}, delay, period);
		
		return timer;
	}
	
	/**
	 * Schedules the given {@link TimerTask} at the given {@link Date}
	 * 
	 * @param timerName the name of the timer
	 * @param date when to execute the operation
	 * @param period specifies the interval between any execution
	 * @param task the task to schedule
	 * @return the timer object used
	 */
	public static Timer scheduleAtFixedRate(String timerName, Date date, long period, TimerTask task) {
		Timer timer = new Timer(timerName);
		
		timer.scheduleAtFixedRate(task, date, period);
		
		return timer;
	}
	
	/**
	 * Schedules a new {@link TimerTask} based on the given {@link Runnable} at the given {@link Date}
	 * 
	 * @param timerName the name of the timer
	 * @param date when to execute the operation
	 * @param period specifies the interval between any execution
	 * @param runnable the runnable to run
	 * @return the timer object used
	 */
	public static Timer scheduleAtFixedRate(String timerName, Date date, long period, Runnable runnable) {
		Timer timer = new Timer(timerName);
		
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				runnable.run();
			}
		}, date, period);
		
		return timer;
	}
}
