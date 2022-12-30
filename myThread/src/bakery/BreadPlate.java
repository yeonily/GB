package bakery;
//싱글톤 패턴
//객체는 무조건 한 개만 만들고 돌려 쓴다.
public class BreadPlate {
	public static BreadPlate breadPlate;
	
	public int breadCount;
	public int eatCount;
	
	private BreadPlate() {;}
	
	public static BreadPlate getInstance() {
		if(breadPlate == null) {
			breadPlate = new BreadPlate();//내가 직접 생성자 호출, 생성자를 한번은 만들어 줘야 함.
		}
		return breadPlate;//이후로는 리턴됨.
	}
	
//	빵 만들기
//	만든 빵이 9개가 넘어가면, 쓰레드를 멈춰준다.
	public synchronized void makeBread() { //-> 직접 쓰레드를 만들 것임.
		if(breadCount > 9) {
			System.out.println("빵이 가득 찼습니다.");
			try {wait();} catch (InterruptedException e) {BreadMaker.check = true;}//메소드에서는 break;쓸수 없음.
		}else {//wait가 풀리면 밑에 문장이 실행이 되니까 else로 막아줌.
			breadCount++;
			System.out.println("빵을 1개 만들었습니다. 현재 빵 개수 : " + breadCount + "개");
		}
	}
	
//	빵 먹기
//	만든 빵이 0개면 못 먹고, 먹은 빵이 20개면 못 먹는다.
//	만약 빵을 먹게 되면, 멈춰있던 쓰레드를 깨워준다.
	public synchronized void eatBread() { // 메인 쓰레드 사용
		if(eatCount == 20) {
			System.out.println("빵이 다 떨어졌습니다.");
		}else if(breadCount < 1) {
			System.out.println("빵을 만들고 있어요!🥐🍞🥨🥯🥖🫓🥪");
		}else {
			eatCount++;
			breadCount--;
			System.out.println("빵을 1개 먹었습니다. 현재 빵 개수 : " + breadCount + "개");
			notify();//빵을 하나라도 먹으면 깨워줘야 함. 안 자고 있을 때 깨우는 건 상관없음.
		}
	}
	
}
