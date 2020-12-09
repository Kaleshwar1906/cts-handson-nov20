package com.org;

public class Counter implements Runnable{

	@Override
	public synchronized void run() {          
		for(int i=1;i<=100;i++) {
			System.out.println("Counter: "+i);
		}
		
	}	

	//if synchronized keyword is used in the run method, then only after the 
	// first thread executes, the second thread enters. 
	
}
