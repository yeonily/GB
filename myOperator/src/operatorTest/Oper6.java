package operatorTest;

public class Oper6 {

	public static void main(String[] args) {
		
		// 1 ~ 10까지 중 4까지만 출력하기
		//0부터 9까지 반복문
//		for (int i = 0; i < 10; i++) {
		//i에 1을 더해서 출력하기
//			System.out.println(i + 1); // 1 2 3 >> 출력과 if문 순서 변경 >> 1 2 3 4
		//i가 3이라면 탈출
//			if(i == 3) {//0 1 2 3 >> 4번 반복
//				break;
//			}
//		}
		
		// 1 ~ 10까지 중 3을 제외하고 출력하기
		//0부터 9까지 반복문
		for (int i = 0; i < 10; i++) {
			//i가 2라면 다음 반복 실행
			if(i == 2) {
				continue;
			}
			//i에 1을 더해서 출력하기
			System.out.println(i + 1);
		}
		
		
	}

}
