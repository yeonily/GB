package july14;

public class AM {

	public static void main(String[] args) {
		
		//변수 : 저장공간
				// 메모리에 변수(저장공간)가 할당됨, 고유한 주소값이 생김(중복X)

		//자료형
//				자료형 기본형				/서식문자
//				int 정수형 4byte 			%d
//				double 실수형 8byte 		%f
//				char 문자형 2byte			%c
//				String 문자열 			%s
				
//				1byte = 8bit
//				short 정수형 2byte
//				long 정수형 8byte			
//				float 실수형 4byte 0.0f
				
//				변수 '앞에 자료형' 또는 '뒤에 대입연산자'가 있으면 저장공간, 그 외에는 값으로 판단
				int data = 20; //저장공간
				data = 30; //저장공간
				System.out.println(data + 9); //값
//				String[] args; //저장공간
				data = data + 7; //저장공간, 값
//				data - 9; //값
			
//				변수를 사용하는 이유
//				1. 반복되는 값을 쉽게 관리할 수 있다.
//				2. 의미없는 값을 하나의 정보로 만들기 위해서 사용한다(자료구조)
				
		//서식문자			
				String name = "싸이";
				int age = 42;
				double weight = 42.6666666;
				
				System.out.printf("이름 : %s\n", name); 
				System.out.printf("이름 : %s", "제시\n"); // 값을 직접 입력해줘도 됨
				System.out.printf("나이 : %d살\n", age); 
				System.out.printf("몸무게 : %fkg\n", weight); //소수점6자리까지출력
				System.out.printf("몸무게 : %.1fkg\n", weight); //반올림해서 소수점1자리까지출력
				System.out.printf("몸무게 : %.2fkg", 20.299); //반올림해서 소수점2자리까지출력

		
				
				
	}

}
