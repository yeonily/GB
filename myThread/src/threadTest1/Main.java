package threadTest1;

public class Main {
//			[실습]
//			동석이네 동물원에는 3마리의 동물이 있다.
//			각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//			나머지 1마리 동물은 2마리 동물이 모두 울고 나서 마지막에 운다.
//
//			package명은 threadTest1으로 만들고 클래스는 2개만 선언한다.
//			하나의 클래스에는 main 쓰레드가 있다.
//			Runnable 인터페이스로 멀티 쓰레드를 구현하고 반드시 join()을 사용한다.
//			※ 각 동물은 10번씩만 운다.
	
	public static void main(String[] args) {
		Animal pig = new Animal();
		Animal duck = new Animal();
		Animal tiger = new Animal();
		
		Thread pigThread = new Thread(pig, "꿀꿀~");
		Thread duckThread = new Thread(duck, "꽥꽥!");
		Thread tigerThread = new Thread(tiger, "어흥");
		
		pigThread.start();
		duckThread.start();
		
		try {
			pigThread.join();
			duckThread.join();
		} catch (InterruptedException e) {;}
		
		tigerThread.start();
		
		
	}
	
	
	
}
