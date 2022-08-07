package aug02;

import java.util.Scanner;

public class Am {
	//메소드는 메소드 밖에 클래스 안에서 선언
	//{} 있으면 선언 / 없으면 사용
	//매개변수는 여러 개 가능
	
	//두 정수의 곱셈 메소드 선언
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	

	public static void main(String[] args) {

		//메소드 사용시, 메소드의 소속을 먼저 알려주기
		Am am = new Am();
		
		am.mul(2, 4);//값
		//리턴타입 ==  void : 값x
		//리턴타입 != void : 값
		System.out.println(am.mul(2, 4));
		
		
//      사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
		//length(), charAt()
		
		//입력 메소드 임포트
		Scanner sc = new Scanner(System.in);
		//입력받은 문자열을 담을 변수, 결과를 담을 변수, 문자열 입력 메세지 변수 선언
		String str = null, result = "", msg = "문자 입력 : ";  
		
		//문자열 입력 메세지 출력
		System.out.print(msg);
		//입력된 문자열 변수에 대입
		str = sc.nextLine();
		
		//0부터 문자열의 길이만큼 반복문
		//문자열의 i번째 문자를 캐릭터 타입 변수에 대입
		//캐릭터 타입 변수가 대문자일 경우
		//소문자로 변환하여 결과변수에 더하고 대입
		//캐릭터 타입 변수가 소문자일 경우
		//대문자로 변환하여 결과변수에 더하고 대입
		//그외의 문자일 경우
		//그대로 결과변수에 더하고 대입
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 65 && c <= 90) {
				result += (char)(c + 32);
			}else if(c >= 96 && c <= 122) {
				result += (char)(c - 32);
			}else {
				result += c;
			}
		}
		
		
		//결과 출력
		System.out.println(result);
		
		
		
		
//		 정수를 한글로 변경
//	      예) 1024
//	        -> 일공이사 
			//charAt()
		
		//입력할 정수를 담을 변수 선언(int 타입)
		int num = 0;
		//정수 입력 메세지, 한글숫자가 담긴 변수, 결과값 선언
		String message = "숫자 입력 : ", hangle = "공일이삼사오육칠팔구", res = "";
		//입력할 정수를 담을 변수 선언(String 타입)
		String number = null;
		
		//int 방법
		//정수 입력 메시지 출력
		System.out.print(message);
		//입력값을 변수에 대입
		num = sc.nextInt();
		
		//변수가 0이 될 때까지 계속 반복, 0이면 탈출
		//정수를 10으로 나눈 나머지 값을 한글숫자로 추출하고 기존 결과를 더하여 결과변수에 대입
		//정수를 10으로 나누고 대입
		while(num != 0) {
			res = hangle.charAt(num % 10) + res;
			num /= 10;
		}
		
		//결과 출력
		System.out.println(res);
		
		//String 방법
		//정수 입력 메세지 출력
		System.out.println(message);
		//입력값을 변수에 대입
		number = sc.nextLine();
		
		//0부터 문자 길이만큼 반복
		//i번째 인덱스의 문자를 추출하여 아스키코드표를 참고하여 해당 숫자를 만든 뒤, 한글숫자문자 추출하여 결과 변수에 대입
		for (int i = 0; i < number.length(); i++) {
			res += hangle.charAt(number.charAt(i) - 48);
		}		
		
		//결과 출력
		System.out.println(res);
		
		
		//원하는 인덱스의 문자 추출 >> charAt(0)
		//원하는 문자 조회 및 검색 >> indexOf("a")
		
	}

}
