package com.bridgelabz;

public class StopWatch {
	public static void main(String[] args) {
		System.out.println("Press '1' to start time: ");
		inputInteger();
		long startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
		System.out.println("press '2' to stop time: ");
		inputInteger();
		long stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);
		long elapsed = stopTimer - startTimer;
		System.out.println("total elapsed time(in millisecond) is :" + elapsed);
	}

	private static void inputInteger() {
		
	}

}
