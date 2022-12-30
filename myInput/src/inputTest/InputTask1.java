package inputTest;

import java.util.Scanner;

public class InputTask1 {

	public static void main(String[] args) {
		//두 정수를 입력한 뒤 덧셈 결과 출력
		//단, next()만 사용
		
		Scanner sc = new Scanner(System.in);
		/* 
		 * int num1 = 0; 
		 * int num2 = 0; 
		 * int res = 0;
		 * 
		 * System.out.print("정수1 입력 : "); 
		 * num1 = Integer.parseInt(sc.next());
		 * System.out.print("정수2 입력 : "); 
		 * num2 = Integer.parseInt(sc.next()); 
		 * res = num1 + num2;
		 * 
		 * System.out.println("두 정수의 합 : "+res);
		 */

		
		//한글로 먼저 써보기
		//두 개의 변수 선언(정수)
		//입력클래스 변수 선언
		//. . . . 
		
		int firstNumber = 0, lastNumber = 0, result = 0; // 변수 선언 최적화(최대한 효율적인 코드 만들기)
		String firstNumberMsg = "첫 번째 정수 : ", lastNumberMsg = "두 번째 정수 : ";
		
		System.out.print(firstNumberMsg);
		firstNumber = Integer.parseInt(sc.next());
		System.out.print(lastNumberMsg);
		lastNumber = Integer.parseInt(sc.next());
		
		result = firstNumber + lastNumber;
				
		System.out.printf("%d + %d = %d", firstNumber, lastNumber, result);
		
		
		
		
		
		
		
	}

}
