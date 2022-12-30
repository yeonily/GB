package randomTest;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 12; i++) {
			System.out.println(r.nextInt(10));
		}
		
		// 난수 ; 규칙성 없음
		// 컴퓨터는 무조건 규칙성이 있다 > 시간으로 기준
		// 규칙성없는 마구잡이 값이 추출됨
		// 범위지정 >> % 사용
		
		
		
		
		
	}

}
