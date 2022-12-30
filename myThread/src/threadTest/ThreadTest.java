package threadTest;

public abstract class ThreadTest {

	public static void main(String[] args) {
		//쓰레드 객체화
//		Thread1 t1 = new Thread1("★");
//		Thread1 t2 = new Thread1("♥");
		
		//멀티 : Thread 클래스 안에 있는 start()메소드를 사용해야 함. start() : run 스케줄링해주고 사용까지 해줌.
//		t1.start();
//		t2.start();
		
		//단일
//		t1.run(); 
//		t2.run();
		
		//쓰레드 객체화
		Runnable t1 = new Thread2();//업캐스팅
		Thread2 t2 = new Thread2();
		Thread2 t3 = new Thread2();
		
//		run메소드를 직접 쓰는 게 아니고 스케줄링을 해야 함.(운영체제에 알려줘야 함.)
		//start를 쓰면 스케줄러가 작동함.
		
		//객체화를 직접 해서 start()를 사용해야 함.
		Thread thread1 = new Thread(t1, "!");
		Thread thread2 = new Thread(t2, "?");
		Thread thread0 = new Thread(t1, "***");
		
		//멀티 쓰레드
		thread0.start();
		thread1.start();
		thread2.start();
		
		//먼저하고 싶은 애들한테 join()을 사용, 우선순위보다 강력
//		join() : 사용한 객체의 쓰레드가 모두 종료되어야 다른 쓰레드가 실행된다.
//				 이미 start()된 쓰레드는 영향을 받지 않는다.
//				 만약 나중에 실행하고자 하는 쓰레드가 있다면, join() 다음에 start()를 실행해야 한다.
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {;}
		
		//내부적으로는 main이 먼저임.(우선순위 1등) 출력은 맨 처음에 안 될 수도 있음.
		System.out.println("main 쓰레드 종료");
		
//		Runnable runner = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		//함수형 인터페이스, 람다식으로 구현가능
		//runner에 run() 구현해놓은 것!
		Runnable runner = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(300);} catch (InterruptedException e) {;}
			}//람다식을 값으로 볼 수 있어야 함. 함수형 인터페이스는 람다식으로 표현 가능함.
		};
		
		//동일한 자원에 접근하기 위해서 
		Thread thread3 = new Thread(runner, "**");
		Thread thread4 = new Thread(runner, "##");
		//runner가 한번만 사용된다면, 아래처럼 쓰일 수 있음.
		Thread thread5 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(300);} catch (InterruptedException e) {;}
			}
		}, "?");
		
		thread3.start();
		thread4.start();
		
	}

}
