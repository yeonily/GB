package lambdaTest;

//함수형 인터페이스 : 추상메소드 1개만 선언 가능
@FunctionalInterface
public interface LambdaInter {
	//추상 메소드 하나만 선언
	//외부에서 입력한 정수가 10의 배수인지 검사하는 메소드
	boolean checkMultipleOf10(int number);
	
}
