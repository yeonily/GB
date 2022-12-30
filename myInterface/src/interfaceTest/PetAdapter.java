package interfaceTest;

//Pet을 implements한 PetAdapter 추상클래스
//추상클래스는 추상메소드와 일반메소드 모두 사용 가능
public abstract class PetAdapter implements Pet {
	//강제성만 없어짐(목적)

	//모든 메소드 재정의하여 강제성이 사라졌고 필요한 것만 갖다 쓰면 됨
	@Override
	public void bang() {
	}

	@Override
	public void giveYourHand() {
	}

	@Override
	public void bite() {
	}

	@Override
	public void sitDown() {
	}

	@Override
	public void waitNow() {
	}

	@Override
	public void getNose() {
	}

}
