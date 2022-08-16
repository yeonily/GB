package lamdaTask;
//함수형 인터페이스
//한 개의 추상 메소드를 선언, 메소드를 구현할 때 이름을 안 쓰려고

@FunctionalInterface
public interface Calc {
	//두 정수를 전달받은 후 더하거나 빼서 리턴한다
	//하나의 추상 메소드만 선언 -> 사용자가 구현해서 쓰는 것임.
	public int calc(int number1, int number2);
}
