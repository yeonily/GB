package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없다");
		} catch (Exception e) { //ArithmeticException에 안들어가면 Exception클래스 업캐스팅되어서 들어감
			//업캐스팅의 단점 : 오류별로 내가 처리할 수 있는 문장을 따로따로 쓸 수가 없음
			System.out.println("알 수 없는 오류"); 
			System.out.println(e); //e : 객체 주소값이 아니라 문자열(오류내용)이 나옴, 객체명을 출력하면 오류내용이 나옴
			//Exception으로 오류를 잡고 e객체명을 출력해서 오류 내용을 보면 됨.
		}
		System.out.println("반드시 실행되어야 하는 문장");
	}
	//모든 오류는 exception 클래스 상속받고 있음
	//
	
}
