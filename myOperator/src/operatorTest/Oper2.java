package operatorTest;

import java.util.Scanner;


public class Oper2 {

	public static void main(String[] args) {
		//두 정수 입력받기
		Scanner sc = new Scanner(System.in);
//		int number1 = 0, number2 = 0;
//		
//		System.out.print("정수1 입력 : ");
//		number1 = sc.nextInt();
//		System.out.print("정수2 입력 : ");
//		number2 = sc.nextInt();
		
		
		int firstNumber = 0, lastNumber = 0; 
		boolean isBigger = false, isSame = false; //boolean의 초기값은 false;
		String message = "정수 두 개를 입력하세요", result = null;
		
		System.out.println(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		isBigger = firstNumber > lastNumber;
		isSame = firstNumber == lastNumber;
		
		result = isBigger ? "큰 값 : " +firstNumber : isSame ? "두 수가 같습니다" : "큰 값 : " +lastNumber; //result 결과값을 전부 문자열로 바꿔주기
		// 삼항연산자 통채로를 값으로 보기!
		System.out.println(result);
		
		
	}

}
