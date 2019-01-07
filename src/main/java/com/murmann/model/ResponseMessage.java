package com.murmann.model;

public class ResponseMessage {

	private String message;
	private long calcTime;
	private boolean isPrime;

	public ResponseMessage(long number) {

		long time = System.currentTimeMillis();

		
		this.isPrime = true;
		
		for (long i = 2; i < number; i++) {
			if ((number % i) == 0)
				this.isPrime = false;
		}

		if (isPrime)
			this.message = number + " ist eine Primzahl";
		else
			this.message = number + " ist keine Primzahl";

		this.calcTime = System.currentTimeMillis() - time;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public void setCalcTime(long calcTime) {
		this.calcTime = calcTime;
	}

	public long getCalcTime() {
		return calcTime;
	}

}
