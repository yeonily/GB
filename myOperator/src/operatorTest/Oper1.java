package operatorTest;

public class Oper1 {

	public static void main(String[] args) {
		System.out.println(10 == 11); // false라는 값
		System.out.println(10 != 11); // true라는 값
		
		boolean isTrue = 10 > 11; //10 > 11은 값이고, 관계연산자 먼저 실행되고 나서 대입
		System.out.println(isTrue); //false
		System.out.println(isTrue && 10 == 10); //false && true >> false  
		System.out.println(isTrue || 10 == 10); //false && true >> true
		//true가 나오도록 수정
//		System.out.println(isTrue && 10 == 10);
//		1. && -> ||
//		2. isTrue -> !isTrue //단항 연산자
		
		int data = 10 > 9 ? 10 : 0;
		
		
	}

}
