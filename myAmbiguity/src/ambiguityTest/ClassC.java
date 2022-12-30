package ambiguityTest;
//모호성1
//interA,B 인터페이스를 지정받음. >> 인터페이스 둘 다 똑같은 디폴트 메소드 선언되어 있음
public class ClassC implements InterA, InterB {
	
	//인터페이스는 부모,
	//재정의를 할 때 부모필드는 super로 접근할 수 있음
	
	@Override
	public void printData() {
		InterA.super.printData();//interA 부모에 있는 printdata를 쓰겠다.
//		InterB.super.printData();//interB 부모에 있는 printdata를 쓰겠다.
	}
}
