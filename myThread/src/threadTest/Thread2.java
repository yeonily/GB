package threadTest;

//멀티쓰레드 구현 방법 2.Runnable 인터페이스 지정
//Runnable 인터페이스는 함수형 인터페이스라서 run() 재정의 필요함.
//메소드 1개일 경우, 람다식으로 구현 가능 > 람다식 메소드가 선언되어 있는 인터페이스 타입임. Runnable 타입
public class Thread2 implements Runnable{

	@Override
	public void run() {
		//run(){자원}
		for (int i = 0; i < 10; i++) {
			//currentThread > static 메소드 > 객체화 없이 사용함
			System.out.println(Thread.currentThread().getName()); //현재 실행중인 쓰레드 객체의 참조를 반환한다. getName. 이름받아오기.
			//0.5초 멈추기
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}

}
