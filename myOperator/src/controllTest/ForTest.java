package controllTest;

public class ForTest {

	public static void main(String[] args) {
		// 이름 10번 출력
		for (int i = 0; i < 10; i=i+1) {
//			System.out.println(i+1+".이름");//결합성 > 연산이 되고 연결이 됨!
			
			// 10 ~ 1까지 출력
			System.out.println(10-i+".이름");
			
			//방법!
			//첫번 째 숫자를 먼저 계산 i+10 > 10부터 시작
			//0+10=10 / 10-0=10 > + 외에 다른 연산자도 생각해보기
			//증가하는 값이 음수이면 좋겠다 라는 생각 > 10-i
			
			
		}

	
		
		
		
	}

}
