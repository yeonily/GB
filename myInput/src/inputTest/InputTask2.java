package inputTest;

import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {
		// 3개의 정수를 한 번에 입력받은 후 
		// 3개의 정수의 곱셈 출력
		
		Scanner sc = new Scanner(System.in);
		
		int firstNumber = 0, secondNumber = 0, lastNumber = 0, result = 0;//초기화 일괄처리
//		String firstNumberMsg = "첫 번째 정수: ", secondNubmerMsg = "두 번째 정수: ", lastNumberMsg = "세 번째 정수: "; 
		String NumberMsg = "정수를 3개 입력해주세요 > ";
		
		System.out.print(NumberMsg);
		firstNumber = Integer.parseInt(sc.next());
		secondNumber = Integer.parseInt(sc.next());
		lastNumber = Integer.parseInt(sc.next());
		
		result = firstNumber * secondNumber * lastNumber;
		System.out.printf("%d * %d * %d = %d", firstNumber, secondNumber, lastNumber ,result);
		
		
		//강사님
		int fNumber = 0, middleNumber = 0, lNumber = 0, res = 0;
		String message = "정수 세 개를 입력하세요 : ";
		
		System.out.print(message);
		
		fNumber = Integer.parseInt(sc.next());
		middleNumber = Integer.parseInt(sc.next());
		lastNumber = Integer.parseInt(sc.next());
		
		result = firstNumber * middleNumber * lastNumber;
	      
	    System.out.printf("%d * %d * %d = %d", fNumber, middleNumber, lNumber, res);

		
	}

}
