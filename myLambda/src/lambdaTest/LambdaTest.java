package lambdaTest;

public class LambdaTest {

	
	public static void main(String[] args) {
		
		//(number) -> number % 10 == 0; <<메소드 구현 완료, 메모리에 할당되니까 주소값임.
		//구현이 안된 추상메소드를 구현하고 있는 것 ! 
		//구현할 때는 사용X 선언O
		
		//주소값은 람다인터 타입(추상메소드가 선언된 인터페이스 타입)
		LambdaInter lambdaInter1 = (number) -> number % 10 == 0; //10의 배수이면 true, 아니면 false // -> 이후에 쓰는 것 : 리턴값
		//람다인터타입의 객체에다가 람다인터타입의 주소값을 넣은 것임. 
										//값으로 봐야 함!
		
		boolean result = lambdaInter1.checkMultipleOf10(10); //구현된 필드의 주소를 가지고 있으니까 바로 사용 가능 
		System.out.println(result);
				
		
		//아래와 같음(복잡하니까 람다식으로 한 줄로 표현)
		//구현이 다 되서 할당된 필드의 주소값!!!!
		//생성자는 할당된 필드의 주소값을 리턴하니까
//		new LambdaInter() {
//			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				return false;
//			}
		//익명 클래스 안에서 선언한 것!(사용X)
//		};
		
		
		//13번째 줄과 동일 
//		LambdaInter lambdaInter1 = new LambdaInter() {
//			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				return num % 10 == 0;
//			}
//		};
		
	
		//위 내용과 동일한 것임
//		LambdaInter lambdaInter1 = [[ new LambdaInter() {
//			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				return number % 10 == 0;
//			}
//		}; ]]-->> (number) -> number % 10 == 0; 한줄로 쓴 것임
		//checkMultipleOf10(number) > 이런 식으로 메소드 이름을 써줘야 하는데,
		//어차피 메소드가 1개 선언되어 있으니 굳이 이름을 안 써줘도 됨
		
		
									//매개변수명은 여기서 내맘대로 써도 됨, 함수형 인터페이스의 변수명과 무관
		LambdaInter lambdaInter2 = (num) -> {
			System.out.println("10의 배수 검사");
			return num % 10 == 0;
		};
		boolean result2 = lambdaInter2.checkMultipleOf10(21);
		System.out.println(result2);
		
		
		//값은 저장공간에 담음
		//타입은 같아야 함
		
		

		
	}

}
