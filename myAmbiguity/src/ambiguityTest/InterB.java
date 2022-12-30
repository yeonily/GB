package ambiguityTest;

public interface InterB {
	//디폴트 메소드
	default void printData() {
		System.out.println("InterB");
	}
}
