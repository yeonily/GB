package stringTest;

import java.util.Scanner;

public class StringTaskA {

	public static void main(String[] args) {
//      사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
		//length(), charAt()
		//입력 메소드 임포트
		Scanner sc = new Scanner(System.in);
		
		//입력받은 문자열을 담을 변수, 결과를 담을 변수, 문자열 입력 메세지 변수 선언
//		String str = null, result = "", msg = "문자열 : ";
//		
		//문자열 입력 메세지 출력
//		System.out.println(msg);
		//입력된 문자열 변수에 대입
//		str = sc.nextLine();
//		
		//0부터 문자열의 길이만큼 반복문
//		for (int i = 0; i < str.length(); i++) {
			//문자열의 i번째 문자를 캐릭터 타입 변수에 대입
//			char c = str.charAt(i);
			//캐릭터 타입 변수가 대문자일 경우
//			if(c >= 65 && c <=90) {//대문자
				//소문자로 변환하여 결과변수에 더하고 대입
//				result += (char)(c + 32);
////				result = result + (char)(c+32);
////				문자열 = 문자 + 문자열
			//캐릭터 타입 변수가 소문자일 경우
//			}else if(c >= 96 && c <= 122) {//소문자
				//대문자로 변환하여 결과변수에 더하고 대입
//				result += (char)(c - 32);
			//그외의 문자일 경우
//			}else {
				//그대로 결과변수에 더하고 대입
//				result += c;
//			}
//		}
//		
//		//결과 출력
//		System.out.println(result);
		
		
		
//      정수를 한글로 변경
//      예) 1024
//        -> 일공이사 
		//charAt()
		
		//입력할 정수를 담을 변수 선언(int 타입)
		int number = 0;
		//정수 입력 메세지, 한글숫자가 담긴 변수, 결과값 선언
		String msg = "정수 : ", hangle = "공일이삼사오육칠팔구", result = "";//누적 연결해야 해서 ""으로 초기화
		//입력할 정수를 담을 변수 선언(String 타입)
		String num = null;
		
		//int 방법
		//정수 입력 메시지 출력
//		System.out.print(msg);
		//입력값을 변수에 대입
//		number = sc.nextInt();
//				
//		//몇 번 반복할 지 알 수 없음
////		System.out.println(number %10);
////		number /= 10; //number = number / 10;
////		System.out.println(number %10);
//		
		//변수가 0이 될 때까지 계속 반복
//		while(number != 0) {
			//정수를 10으로 나눈 나머지 값을 한글숫자로 추출하고 기존 결과를 더하여 결과변수에 대입
//			result = hangle.charAt(number % 10) + result; //기존의 값을 뒤로 보내서 연결
			//정수를 10으로 나누고 대입
//			//number = number / 10;
//			number /= 10;
//		}
		
		//String 방법
		//정수 입력 메세지 출력
		System.out.print(msg);
		//입력값을 변수에 대입
		num = sc.next();
		
		//0부터 문자 길이만큼 반복
		for (int i = 0; i < num.length(); i++) {
			//i번째 인덱스의 문자를 추출하여 아스키코드표를 참고하여 해당 숫자를 만든 뒤, 한글숫자문자 추출하여 결과 변수에 대입
			result += hangle.charAt(num.charAt(i) - 48);
		}
		
		//결과 출력
		System.out.println(result);
	}

}
