package bakery;

public class BreadMaker implements Runnable{
	
	public static boolean check;
	
	//객체화
//	BreadPlate breadPlate = new BreadPlate();
	
	@Override
	public void run() {
		int i = 0;
		// 빵을 20개 만든다.
		for (i = 0; i < 20; i++) {
			//한번만 쓰니까 for문 안으로 넣어버림.
			BreadPlate.getInstance().makeBread();
			if(check) {break;}
			try {Thread.sleep(300);} catch (InterruptedException e) {break;}
		}
		if(i != 20) {
			System.out.println("안녕히 가세요");
			return;
		}
		System.out.println("재료 소진");
	}

}
