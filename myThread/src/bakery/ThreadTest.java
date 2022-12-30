package bakery;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("실행중...");
			if(Thread.interrupted()) {//interrupted를 2번 쓰면 false라서 한번만 써야 함.
				break;
			}
		}
	}
	
	

}
