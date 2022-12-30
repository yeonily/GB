package myJobTask;

import java.util.Random;

public class Job {
	String name;
	int wallet;
	int workingTime;
	int output;
	
	public Job() {
		
	}
	
	public Job(String name, int wallet, int workingTime) {
		super();
		this.name = name;
		this.wallet = wallet;
		this.workingTime = workingTime;
	}

	void work() {
		wallet += 10000;
		workingTime++;
	}
	
	boolean make() {
		
			
		Random r = new Random();
		int rating = 50;
		int[] percent = new int[10];
		boolean finish = false;
		
		for (int i = 0; i < rating/10; i++) {
			percent[i] = 1;
		}
			
		if(percent[r.nextInt(percent.length)] == 1) {
			output++;
			finish = true;
			return finish;
		}
		
		
		return finish;
		
		
		
		
	}
	
	
}
