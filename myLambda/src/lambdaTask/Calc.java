package lambdaTask;

@FunctionalInterface
public interface Calc {
//	두 정수를 전달받은 후 더하거나 빼서 리턴한다.
	//더할지 뺄지 모름 -> 추상메소드
	public int calc(int num1, int num2);
}
