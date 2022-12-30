package threadTest2;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		
		//Runnable 구현
		Runnable runner = () -> {
			//입력한 대로 출력되는 run메소드
			System.out.println(Thread.currentThread().getName());
		};
		
		
		String[] engNum = {"first", "second", "third"};
		
		//쓰레드로 다운캐스팅
//		for (int i = 0; i < engNum.length; i++) {
//			Thread[] threads = new Thread[runner, engNum[i]];
//		}
//		Thread thread_1 = new Thread(runner, engNum[0]);
//		Thread thread_2 = new Thread(runner, engNum[1]);
//		Thread thread_3 = new Thread(runner, engNum[2]);

		//입력메소드
		Scanner sc = new Scanner(System.in);
		String msg = "1~3의 정수 입력(ex, 2 1 3) : ";
		String number = "";
		String[] split = new String[3];
		
		
		//사용자가 입력
		System.out.print(msg);
		number = sc.next();
		split = number.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		//입력값에 따라 쓰레드 진행
//		if(number ) {
//			threads_1.start();
//			threads_2.start();
//			threads_3.start();
//		}
		
		
//		//객체화
//		ThreadTask threadTask = new ThreadTask();
//		threadTask.printFirst(thread_1);
//		threadTask.printSecond(thread_2);
//		threadTask.printThird(thread_3);
		
	}
	
}
