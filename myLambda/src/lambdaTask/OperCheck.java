package lambdaTask;

@FunctionalInterface
public interface OperCheck {
//	전체 식을 전달받아서 연산자만 쏙쏙 분리해주는 메소드
	//연산자는 사용하는 사람만 암 -> 추상메소드
	public String[] checkOper(String expression);
}
