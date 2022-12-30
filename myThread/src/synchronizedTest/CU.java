package synchronizedTest;

public class CU {

	public static void main(String[] args) {
		ATM atm = new ATM(); //Runnable 타입의 자원
		
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		//동일한 자원에 접근, 자원 공유
		
		mom.start();//스케줄링
		son.start();//스케줄링
		
		//멀티쓰레드에서 일부분만 단일로 바뀜 > 동기화
		
		
	}

}
