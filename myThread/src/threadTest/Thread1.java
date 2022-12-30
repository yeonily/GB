package threadTest;

//멀티쓰레드 구현 방법 1.Thread 클래스 상속
public class Thread1 extends Thread{
	
	public String data;
	
	//기본생성자
	public Thread1() {
	}
	
	//초기화생성자
	public Thread1(String data) {
		super();
		this.data = data;
	}

	//run 재정의
	@Override
	public void run() {
		//데이터 출력 10번 반복
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
			//1초 멈추기
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
	}
}
