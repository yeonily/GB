package threadTest1;

import threadTest.Thread2;

public class Zoo {

	public static void main(String[] args) {
		String[] sounds = {"꼬끼오~", "꿀꿀", "꽥꽥!!"};
		//동물소리만큼 animal 배열 만들기
		Animal[] animals = new Animal[sounds.length];
		//동물소리만큼 thread 배열 만들기
		Thread[] threads = new Thread[sounds.length];
		
		//쓰레드 배열 길이만큼 반복
		for (int i = 0; i < threads.length; i++) {
			//동물 객체화
			animals[i] = new Animal();
			//쓰레드 객체화, sounds를 이름으로
			threads[i] = new Thread(animals[i], sounds[i]);
		}
		
		
		for (int i = 0; i < threads.length; i++) {
			//멀티쓰레드 시작		
			threads[i].start();
			if(i != 0) {
				try {threads[i].join();} catch (InterruptedException e) {;}
			}
		}
		//threads[0].start() > 어흥 10번
		//threads[1].start() > 멍멍 10번
		//if문 참 > threads[1].join() >> join걸림. 어흥멍멍 동시에 나옴. threads[1] 끝나고 나서 다음 start() 실행
		//join() 다음에 start()실행하는 것은 나중에 실행됨.
		//threads[2].start() > 야옹 10번 따로 나중에 실행됨.
		//if문 참 > threads[2].join() 
		
		Thread2 t1 = new Thread2();//업캐스팅
		Thread2 t2 = new Thread2();
		Thread2 t3 = new Thread2();
		
		Thread thread0 = new Thread(t1, "***");
		Thread thread1 = new Thread(t2, "!");
		Thread thread2 = new Thread(t3, "?");
		
		thread0.start();
		thread1.start();
		try {thread1.join();} catch (InterruptedException e) {;}
		thread2.start();
		try {thread2.join();} catch (InterruptedException e) {;}
		
//	join() : 사용한 객체의 쓰레드가 모두 종료되어야 다른 쓰레드가 실행된다.
//	이미 start()된 쓰레드는 영향을 받지 않는다.
//	만약 나중에 실행하고자 하는 쓰레드가 있다면, join() 다음에 start()를 실행해야 한다.
	}

}
