package interfaceTest;

//Pet을 implements할 때는 구현되지 않은 메소드를 모두 재정의 해야함.
//그런데 Stone클래스는 모든 메소드가 다 필요하지 않음 >> Adapter를 implements하기
public class Stone extends PetAdapter {

	//내가 필요한 메소드만 재정의하기
	@Override
	public void sitDown() {
		System.out.println("앉는다");

	}

	@Override
	public void waitNow() {
		System.out.println("기다린다");

	}

}
