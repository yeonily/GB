package interfaceTest;

//Pet을 implements했기 때문에 구현되지 않은 메소드를 모두 재정의 해야함.
public class Dog implements Pet{
	
	//추상 메소드 구현만 하면 됨
	@Override
	public void bang() {
		System.out.println("드러눕는다.");
	}

	@Override
	public void giveYourHand() {
		System.out.println("손을 준다.");
		
	}

	@Override
	public void bite() {
		System.out.println("문다.");
		
	}

	@Override
	public void sitDown() {
		System.out.println("앉는다.");
		
	}

	@Override
	public void waitNow() {
		System.out.println("기다린다.");
		
	}

	@Override
	public void getNose() {
		System.out.println("코를 손가락에 넣는다.");
		
	}

}
