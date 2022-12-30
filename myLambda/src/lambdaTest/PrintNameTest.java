package lambdaTest;

public class PrintNameTest {

//Starbucks클래스(매개변수를 검사)
	//외부에서 람다식으로 구현한 값을 name으로 전달받기
	public static void printFullName(PrintName name) {
		System.out.println(name.getFullName("김", "지"));
	}
	
	
//Building클래스(printName의 printfullname메소드 사용, 람다식으로 추상메소드 내용 구현)
	public static void main(String[] args) {
		//추상 메소드 선언O, 사용X
		//매개변수 2개를 설정하고, 두 문자열을 연결하도록 구현한다.
		printFullName((f, l) -> f+l); //람다식으로 printFullName메소드가 실행됨
		//static 메소드여서 객체화 안해줘도 됨
		
		//(f, l) -> f+l >> 구현되었으니 할당된 필드의 주소값으로 봐야 함
		
		
	}
	
}
