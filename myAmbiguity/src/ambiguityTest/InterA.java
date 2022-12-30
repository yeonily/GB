package ambiguityTest;

public interface InterA {
	//인터페이스에서는 추상메소드만 선언가능함
	//인터페이스에서 일반메소드를 선언하려면 default를 써야 함 
	default void printData() {
		System.out.println("InterA");
	}
}
