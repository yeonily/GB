package lamdaTask;
//함수형 인터페이스
//한 개의 추상 메소드를 선언, 사용자가 메소드를 구현할 때 이름을 안 쓰려고 
@FunctionalInterface
public interface OperCheck {
//	전체 식을 전달받아서 연산자만 쏙쏙 분리해주는 메소드
	//연산자는 사용하는 사람만 암 -> 추상메소드
	//사용자가 구현할 때 사용할 연산자를 결정함.
	public String[] checkOper(String expression);
}
 