package variableTest;

public class FormatTest {

	public static void main(String[] args) {
		// 이름, 나이, 몸무게 저장할 변수 선언

		String name = "김지연";
		int age = 20;
		double weight = 50.0;
		
		System.out.printf("이름 : %s\n", name); // name 에는 값임, 
		System.out.printf("이름 : %s", "김장미\n"); // 값을 직접 입력해줘도 됨
		
		System.out.printf("나이 : %d살\n", age); //age가 %d에 들어가서 %d가 출력되는 것임
		System.out.printf("나이 : %02d살\n몸무게 : %.1fkg", age, weight); 
		//7째자리부터 문제가 생겨서 6째자리까지만 나옴
		//%.f 소수점쓸거야 / 소수점은 반올림됨
		//%.0f 소수점삭제
		//%.1f 소수점1자리만
		//%.2f 소수점2자리만
		
	}

}
